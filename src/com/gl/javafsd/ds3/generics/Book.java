package com.gl.javafsd.ds3.generics;

public class Book {

	private String title;
	private String isbn;
	private String author;
	private int year;
	
	public Book(String title, String isbn, String author, int year) {
		
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}
