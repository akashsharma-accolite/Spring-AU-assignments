package com.au.library.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.model.Book;

@Repository
public class BooksDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> all()
	{
		return (List<Book>) jdbcTemplate.query("select * from book", (rs, i) -> {
			return new Book(rs.getString("id"), 
					rs.getString("bookName"), 
					rs.getString("authorName"), 
					rs.getDouble("price"), 
					rs.getString("desc1"));
		});
	}
	
	public Book getBookById(String id) {
		List<Book> books = jdbcTemplate.query("select * from book where id='"+id+"'", (rs, i) -> {
			return new Book(rs.getString("id"), 
					rs.getString("bookName"), 
					rs.getString("authorName"), 
					rs.getDouble("price"), 
					rs.getString("desc1"));
		});
		return books.get(0);	
		}
	
//	public Book create(Book book)
//	{
//		jdbcTemplate.update("insert into book (id,bookName,authorName,price,desc1)"+"values(?,?,?,?,?)"),
//		new Object[](Integer.p)
//	}
	
	public Book create(Book book) 
	{
		jdbcTemplate.update("insert into book values(?,?,?,?,?)",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice(),
				book.getDescription());
				
		return book;
	}
	
	public Book checkoutBook(Book book) 
	{
		jdbcTemplate.update("insert into checkoutBook values(?,?,?,?,?)",
				book.getId(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice(),
				book.getDescription());
				
		return book;
	}
	
	public List<Book> allCheckout()
	{
		return (List<Book>) jdbcTemplate.query("select * from checkoutBook", (rs, i) -> {
			return new Book(rs.getString("id"), 
					rs.getString("bookName"), 
					rs.getString("authorName"), 
					rs.getDouble("price"), 
					rs.getString("desc1"));
		});
	}
	
}
