package com.capgemini.lms_hibernate.service;

import java.util.List;

import com.capgemini.lms_hibernate.dto.BookBean;
import com.capgemini.lms_hibernate.dto.UsersBean;

public interface UsersService {
	boolean register(UsersBean user);
	UsersBean login(String email,String password);	
	List<BookBean> searchBookById(int bId);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> getBooksInfo();
	boolean updatePassword(int id,String password,String newPassword,String role);


}
