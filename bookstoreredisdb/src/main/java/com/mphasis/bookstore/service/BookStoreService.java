package com.mphasis.bookstore.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mphasis.bookstore.domain.Book;
import com.mphasis.bookstore.repository.BookRepository;

@Service("bookstoreService")
@Scope("singleton")
public class BookStoreService implements IBookStoreService {

	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

	@Override
	public Book update1(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public void patchBook(Map<String, Object> updates, String id) {
		// TODO Auto-generated method stub
		Book dbBook=bookRepository.findById(id).get();
		Integer price=(Integer)updates.get("price");
		if(price !=null) {
			dbBook.setPrice(price);
			bookRepository.save(dbBook);
		}
	}

	@Override
	public Book getBookById1(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	
}
	