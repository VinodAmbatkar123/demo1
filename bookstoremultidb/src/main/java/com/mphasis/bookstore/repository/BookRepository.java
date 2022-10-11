package com.mphasis.bookstore.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.bookstore.domain.Book;


@Repository("bookRepository")
@Scope("singleton")
public interface BookRepository extends CrudRepository<Book, String> {
//	List<Book> findByNameLike(String name); 

//	List<Book> findByPrice(int price);

	//void deleteById(String id);

	//Book findById(String id); 

}
