package com.au.library.conroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.au.library.model.Book;
import com.au.library.repository.BooksDAO;

@RestController
public class BooksController {

	
	@Autowired
	BooksDAO bdao;
	
	
	@RequestMapping(value="/books", method=RequestMethod.GET)
	public List<Book> getAll() 
	{
		return bdao.all();
	}
	
	@RequestMapping(value="/books/get/{id}", method=RequestMethod.GET)
	public Book getBookById(@PathVariable(value="id") String id)
	{
		return bdao.getBookById(id);
	}
	
	@RequestMapping(value="/books",method = RequestMethod.POST,consumes="application/json")
	public Book create(@RequestBody Book bookToCreate) {
		return bdao.create(bookToCreate);
	}
	
	@RequestMapping(value="/booksCheckout",method = RequestMethod.POST,consumes="application/json")
	public Book checkoutBook(@RequestBody Book bookToCreate) {
		return bdao.checkoutBook(bookToCreate);
	}
	
	@RequestMapping(value="/booksCheckout", method=RequestMethod.GET)
	public List<Book> getAllCheckout() 
	{
		return bdao.allCheckout();
	}
	
	
}
