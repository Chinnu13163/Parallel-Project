package com.capgemini.lms_collections.dao;

import java.util.List;
import java.util.List;

import com.capgemini.lms_collections.dto.Admin;
import com.capgemini.lms_collections.dto.Book;
import com.capgemini.lms_collections.dto.RequestBean;
import com.capgemini.lms_collections.dto.User;

public interface AdminDAO {
	boolean registerAdmin(Admin admin);
	Admin loginAdmin(String email,String password);
	boolean addBook(Book book);
	boolean removeBook(int id);
	List<Book> searchBookByTitle(String bookName);
	List<Book> searchBookByAuthor(String author);
	List<Book> searchBookByCategory(String category);
	List<Book> getBooksInfo();

	List<User> showUsers();
	List<RequestBean> showRequests();
	boolean bookIssue(User user,Book book);
	boolean isBookReceived(User user,Book book);
}
