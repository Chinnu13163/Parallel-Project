package com.capgemini.lms_collections.service;

import java.util.List;

import com.capgemini.lms_collections.dao.UserDAO;
import com.capgemini.lms_collections.dto.Book;
import com.capgemini.lms_collections.dto.RequestBean;
import com.capgemini.lms_collections.dto.User;
import com.capgemini.lms_collections.factory.LibraryFactory;

public class UserServiceImplementation implements UserService{
	private UserDAO dao = LibraryFactory.getUserDao();

	@Override
	public boolean registerUser(User user) {
		return dao.registerUser(user);
	}

	@Override
	public User loginUser(String email, String password) {
		return dao.loginUser(email, password);
	}

	@Override
	public RequestBean bookRequest(User user, Book book) {
		return dao.bookRequest(user, book);
	}

	@Override
	public RequestBean bookReturn(User user, Book book) {
		return dao.bookReturn(user, book);
	}

	@Override
	public List<Book> searchBookByTitle(String bookName) {
		return dao.searchBookByTitle(bookName);
	}

	@Override
	public List<Book> searchBookByAuthor(String author) {
		return dao.searchBookByAuthor(author);
	}

	@Override
	public List<Book> searchBookByCategory(String category) {
		return dao.searchBookByCategory(category);
	}

	@Override
	public List<Book> getBooksInfo() {
		return dao.getBooksInfo();
	}	
}
