package com.capgemini.lms_jdbc.service;

import java.util.List;

import com.capgemini.lms_jdbc.dto.BorrowedBooks;
import com.capgemini.lms_jdbc.factory.LibraryFactory;
import com.capgemini.lms_systemjdbc.dao.StudentDAO;

public class StudentServiceImplement implements StudentService{
	
	private StudentDAO dao = LibraryFactory.getStudentDao();

	@Override
	public boolean request(int uId, int bId) {
		// TODO Auto-generated method stub
		return dao.request(uId, bId);
	}

	@Override
	public List<BorrowedBooks> borrowedBook(int uId) {
		// TODO Auto-generated method stub
		return dao.borrowedBook(uId);
	}

	@Override
	public boolean returnBook(int bId, int uId, String status) {
		// TODO Auto-generated method stub
		return dao.returnBook(bId, uId, status);
	}

}
