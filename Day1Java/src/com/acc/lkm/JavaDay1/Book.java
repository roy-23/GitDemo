package com.acc.lkm.JavaDay1;

import java.sql.Date;

public class Book {
	private String author_name;
	private String year_of_publication;
	private String book_title;
	
	
	public Book(String author_name, String year_of_publication, String book_title) {
		super();
		this.author_name=author_name;
		this.year_of_publication=year_of_publication;
		this.book_title=book_title;
	}
	
	void display() {
		System.out.println(author_name);
		System.out.println(this.year_of_publication);
		System.out.println(this.book_title);
	}
	
	
	public static void main(String[] args) {
		Book b = new Book("Roy", "23/07/1999","All iz well");
		b.display();
	}
}
