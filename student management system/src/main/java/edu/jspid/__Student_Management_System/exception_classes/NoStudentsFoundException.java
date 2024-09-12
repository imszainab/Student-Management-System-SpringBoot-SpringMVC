package edu.jspid.__Student_Management_System.exception_classes;

public class NoStudentsFoundException extends RuntimeException{

	@Override
	public String getMessage() {
		return "No Student Are Present In Database, Database is Empty... ";
	}
}
