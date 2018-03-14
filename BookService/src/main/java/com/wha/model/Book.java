package com.wha.model;

import java.util.List;

public class Book {
	private long id;
	private String title;
	private BookType type;
	private int year;
	private List<Author> autors;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BookType getType() {
		return type;
	}
	public void setType(BookType type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public List<Author> getAutors() {
		return autors;
	}
	public void setAutors(List<Author> autors) {
		this.autors = autors;
	}
	
	
}
