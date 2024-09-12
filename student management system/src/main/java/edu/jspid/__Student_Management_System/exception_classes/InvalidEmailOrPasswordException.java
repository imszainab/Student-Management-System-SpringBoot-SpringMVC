package edu.jspid.__Student_Management_System.exception_classes;

public class InvalidEmailOrPasswordException extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Invalid Credentials, i.e Invalid Email Or Password ";
	}

}
