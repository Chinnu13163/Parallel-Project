package com.capgemini.lms_collections.service;

import java.util.List;

import com.capgemini.lms_collections.dto.Book;
import com.capgemini.lms_collections.dto.RequestBean;
import com.capgemini.lms_collections.dto.User;

public interface UserService {
	boolean registerUser(User user);
	User loginUser(String email,String password);
	public RequestBean bookRequest(User user, Book book);
	public RequestBean bookReturn(User student, Book book);
	List<Book> searchBookByTitle(String bookName);
	List<Book> searchBookByAuthor(String author);
	List<Book> searchBookByCategory(String category);
	List<Book> getBooksInfo();
	
}
