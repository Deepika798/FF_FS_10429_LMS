package com.hcl.training.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.training.model.Book;

public interface UserService {

	List<Book> fetchData(String categoryName);

	void saveData(Book book);

}
