package com.wha.model;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name= "BookService", serviceName="BookService")
public interface BookService {
	
	@WebMethod
	Book getBook(long id) throws BookNotFoundException;
	
	@WebMethod
	List<Book> getBookByTitle(@WebParam(name="bookTitle") String title) throws BookNotFoundException	;
	
	@WebMethod
	List<Author> getAthorsFromBook(String bookTitle);
	
	@WebMethod
	long createBook(String title, BookType type, int year, long authorsId);
	
}
