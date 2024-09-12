package edu.jspid.__Student_Management_System.exception_classes;

public class InvalidPhoneOrPasswordException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Invalid Credentials, i.e Invalid Phone Number Or Password ";
	}

}
