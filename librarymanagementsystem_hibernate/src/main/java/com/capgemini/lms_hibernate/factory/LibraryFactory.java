package com.capgemini.lms_hibernate.factory;

import com.capgemini.lms_hibernate.dao.AdminDAO;
import com.capgemini.lms_hibernate.dao.AdminDAOImplement;
import com.capgemini.lms_hibernate.dao.StudentDAO;
import com.capgemini.lms_hibernate.dao.StudentDAOImplement;
import com.capgemini.lms_hibernate.dao.UsersDAO;
import com.capgemini.lms_hibernate.dao.UsersDAOImplement;
import com.capgemini.lms_hibernate.service.AdminService;
import com.capgemini.lms_hibernate.service.AdminServiceImplement;
import com.capgemini.lms_hibernate.service.StudentService;
import com.capgemini.lms_hibernate.service.StudentServiceImplement;
import com.capgemini.lms_hibernate.service.UsersService;
import com.capgemini.lms_hibernate.service.UsersServiceImplement;

public class LibraryFactory {
	public static UsersDAO getUsersDao() {
		return new UsersDAOImplement();
	}
	public static UsersService getUsersService() {
		return new UsersServiceImplement();
	}
	
	public static AdminDAO getAdminDao() {
		return new AdminDAOImplement();
	}
	public static AdminService getAdminService() {
		return new AdminServiceImplement();
	}
	
	public static StudentDAO getStudentDao() {
		return new StudentDAOImplement();
	}
	public static StudentService getStudentService() {
		return new StudentServiceImplement();
	}
}
