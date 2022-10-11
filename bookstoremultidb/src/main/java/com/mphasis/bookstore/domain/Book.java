package com.mphasis.bookstore.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.redis.core.RedisHash; 

  

 

 

 @RedisHash

public class Book { 

 

 @Id 

private String id; 

  

private String name; 

  

private int price; 

 

public Book() {} 

public Book(  String name, int price) { 

super(); 

this.name = name; 

this.price = price; 

} 

 

public Book(String id, String name, int price) { 

super(); 

this.id = id; 

this.name = name; 

this.price = price; 

} 

public String getId() { 

return id; 

} 

public void setId(String id) { 

this.id = id; 

} 

public String getName() { 

return name; 

} 

public void setName(String name) { 

this.name = name; 

} 

public int getPrice() { 

return price; 

} 

public void setPrice(int price) { 

this.price = price; 

} 

@Override 

public String toString() { 

return "Product [id=" + id + ", name=" + name + ", price=" + price + "]"; 

}

} 

 

 

