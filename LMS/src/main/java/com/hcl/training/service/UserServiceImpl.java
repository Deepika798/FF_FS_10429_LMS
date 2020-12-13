package com.hcl.training.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.training.model.Book;
import com.hcl.training.repository.BookRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	BookRepository repo;
	
			@Override
			public List<Book> fetchData(String categoryName) {
				
				List<Book> ls=repo.findByCategoryName(categoryName);
				for(int i=0;i<ls.size();i++) {
					System.out.println(ls.get(i));
				}
				System.out.println(ls.get(0).getAuthor());
				return ls;
			}

			@Override
			public void saveData(Book book) {
							
			}
		
	

}
