package com.wha.model;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName="AthorService")
public interface AuthorService {
	
	@WebMethod
	List<Book> getBooksFromAuthor(String authorFirstName, String autorsLastName) throws AuthorNotFoundException;
	
	@WebMethod
	Author getAuthor(Long id) throws AuthorNotFoundException;
	
	@WebMethod
	List<Author> getAuthorsByName(String firstName, String lastName) throws AuthorNotFoundException;
	
	long createAuthor(String firstName, String lastName, String nationality, Date dateOfBirth, Date dateOfDeath);

}
