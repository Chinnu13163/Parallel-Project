package com.capgemini.lms_jdbc.factory;

import com.capgemini.lms_jdbc.service.AdminService;
import com.capgemini.lms_jdbc.service.AdminServiceImplement;
import com.capgemini.lms_jdbc.service.StudentService;
import com.capgemini.lms_jdbc.service.StudentServiceImplement;
import com.capgemini.lms_jdbc.service.UsersService;
import com.capgemini.lms_jdbc.service.UsersServiceImplement;
import com.capgemini.lms_systemjdbc.dao.AdminDAO;
import com.capgemini.lms_systemjdbc.dao.AdminDAOImplement;
import com.capgemini.lms_systemjdbc.dao.StudentDAO;
import com.capgemini.lms_systemjdbc.dao.StudentDAOImplement;
import com.capgemini.lms_systemjdbc.dao.UsersDAO;
import com.capgemini.lms_systemjdbc.dao.UsersDAOImplement;

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
