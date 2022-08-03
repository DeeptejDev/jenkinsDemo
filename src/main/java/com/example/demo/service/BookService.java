package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookrepo;
	
	public Integer saveBook(Book book) {
		bookrepo.save(book);
		return book.getId();
		
	}

}
