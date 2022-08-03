package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookserv;
	@PostMapping("/save")
	public ResponseEntity<String>registerBook(@RequestBody Book book) {
		bookserv.saveBook(book);
		return new ResponseEntity<String>("book added",HttpStatus.OK);
		
	}

}
