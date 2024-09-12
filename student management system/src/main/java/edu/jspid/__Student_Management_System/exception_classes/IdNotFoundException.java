package edu.jspid.__Student_Management_System.exception_classes;

public class IdNotFoundException extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Invalid Student Id, Student with this ID is not Present in Data";
	}

}
