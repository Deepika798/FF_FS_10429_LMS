package com.hcl.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.training.model.Book;
import com.hcl.training.model.Category;
import com.hcl.training.service.UserService;

import io.swagger.annotations.Api;
@Api(value = "Swagger2DemoRestController", description = "REST APIs related to Department Entity!!!!")
@RestController
@RequestMapping("/book")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestBody Book book) {
		try {
			userService.saveData(book);
			return new ResponseEntity<>("Insertion Success", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>("Insertion Failed", HttpStatus.BAD_REQUEST);
		}
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/fetchData/{categoryName}")
	public ResponseEntity<List<Book>> fetchData(@PathVariable("categoryName") String categoryName) {
		List<Book> book = new ArrayList<Book>();
		userService.fetchData(categoryName).forEach(book::add);
		System.out.println(book);
		
		System.out.println(categoryName);
		int i=0;
		if(!book.isEmpty()) { 
			
			return new ResponseEntity<>(book,HttpStatus.OK);
		}
		return new ResponseEntity<>(book, HttpStatus.NO_CONTENT);
	}

}
