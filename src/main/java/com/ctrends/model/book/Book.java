package com.ctrends.model.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_tb")
public class Book {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "bookname")
	private String bookname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return bookname;
	}
	public void setName(String bookname) {
		this.bookname = bookname;
	}
	
	public Book(int id, String bookname) {
		this.id = id;
		this.bookname = bookname;
	}
	public Book() {}
	
	
}
