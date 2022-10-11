package com.mphasis.bookstore.service;

import java.util.List;
import java.util.Map;

import com.mphasis.bookstore.domain.Book;

public interface IBookStoreService {
	Book save(Book book);
	
	
	void delete(String id);
	//List<Book> getAllBooks();
	 

//	List<Book> getAllBooksByName(String name); 

	//List<Book> getAllBooksByPrice(int price);
	//String getAllBookById1(String id);

	

	Book update1(Book book); 

	 void patchBook(Map<String,Object>updates,String id);


	 Book getBookById1(String id);

}


