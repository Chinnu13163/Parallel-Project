package com.capgemini.lms_collections.database;

import java.util.LinkedList;

import com.capgemini.lms_collections.dto.Admin;
import com.capgemini.lms_collections.dto.Book;
import com.capgemini.lms_collections.dto.RequestBean;
import com.capgemini.lms_collections.dto.User;

public class LibraryDB {
	public static final LinkedList<Book> BOOKS = new LinkedList<Book>(); 
	public static final LinkedList<Admin> ADMIN = new LinkedList<Admin>();
	public static final LinkedList<User> USER = new LinkedList<User>();
	public static final LinkedList<RequestBean> REQUEST = new LinkedList<RequestBean>();

	public static void addToDB() {

		ADMIN.add(new Admin(111111,"Chinnu","Chinnu@123","Chinnu@gmail.com",785963147));

		
		BOOKS.add(new Book(101010,"java","james","gosling","coding"));
		BOOKS.add(new Book(101011,"history","tom","henry feild","world"));
		BOOKS.add(new Book(101012,"angular","misko","adam","js"));
		BOOKS.add(new Book(101013,"computers","charles","aborns","programing"));

	}


}


