package com.hcl.training.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.training.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	@Query("select b from Book b, Category c where c.categoryName=?1 and c.id=b.categoryId")
	List<Book> findByCategoryName(String categoryName);

}
