package com.capgemini.lms_springrest.dao;

import java.util.List;

import com.capgemini.lms_springrest.dto.BookBean;
import com.capgemini.lms_springrest.dto.UsersBean;

public interface UsersDAO {
	boolean register(UsersBean user);
	UsersBean login(String email,String password);	
	List<BookBean> searchBookById(int bId);
	List<BookBean> searchBookByTitle(String bookName);
	List<BookBean> searchBookByAuthor(String author);
	List<BookBean> getBooksInfo();
	boolean updatePassword(int id,String password,String newPassword,String role);

}
