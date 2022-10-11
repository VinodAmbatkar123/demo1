package com.mphasis.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mphasis.bookstore.domain.Book;
import com.mphasis.bookstore.repository.BookRepository;



@SpringBootApplication
public class BookstoremultidbApplication implements CommandLineRunner{
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoremultidbApplication.class, args);
		System.out.println("******** This is Spring Boot Application ***********");
	}

	@Override
	public void run(String... args) throws Exception {
	
		bookRepository.save(new Book( "gujrati", "vinod", 1001));
		bookRepository.save(new Book( "hindi", "tina", 5201));
		bookRepository.save(new Book( "marathi", "paro",8502));
		bookRepository.save(new Book( "python", "namo", 3001));
		System.out.println(bookRepository.findAll());
		
	}

}
