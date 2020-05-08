package com.capgemini.lms_collections.service;

import java.util.List;

import com.capgemini.lms_collections.dao.AdminDAO;
import com.capgemini.lms_collections.dto.Admin;
import com.capgemini.lms_collections.dto.Book;
import com.capgemini.lms_collections.dto.RequestBean;
import com.capgemini.lms_collections.dto.User;
import com.capgemini.lms_collections.factory.LibraryFactory;

public class AdminServiceImplement implements AdminService{
	private AdminDAO dao = LibraryFactory.getAdminDao();

	@Override
	public boolean registerAdmin(Admin admin) {
		return dao.registerAdmin(admin);
	}

	@Override
	public Admin loginAdmin(String email, String password) {
		return dao.loginAdmin(email, password);
	}

	@Override
	public boolean addBook(Book book) {
		return dao.addBook(book);
	}

	@Override
	public boolean removeBook(int id) {
		return dao.removeBook(id);
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

	@Override
	public List<User> showUsers() {
		return dao.showUsers();
	}

	@Override
	public List<RequestBean> showRequests() {
		return dao.showRequests();
	}

	@Override
	public boolean bookIssue(User user, Book book) {
		return dao.bookIssue(user, book);
	}

	@Override
	public boolean isBookReceived(User user, Book book) {
		return dao.isBookReceived(user, book);
	}

	
	
}
