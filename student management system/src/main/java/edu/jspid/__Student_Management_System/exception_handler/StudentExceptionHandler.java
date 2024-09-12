package edu.jspid.__Student_Management_System.exception_handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import edu.jspid.__Student_Management_System.exception_classes.IdNotFoundException;
import edu.jspid.__Student_Management_System.exception_classes.InvalidEmailOrPasswordException;
import edu.jspid.__Student_Management_System.exception_classes.InvalidPhoneOrPasswordException;
import edu.jspid.__Student_Management_System.exception_classes.NoStudentsFoundException;
import edu.jspid.__Student_Management_System.response_structure.ResponseStructure;


@RestControllerAdvice
public class StudentExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleIdNotFoundException(
			IdNotFoundException idNotFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NO_CONTENT.value());
		structure.setMessage("Invalid Student Id");
		structure.setBody(idNotFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(InvalidEmailOrPasswordException.class)
	public ResponseEntity<ResponseStructure<String>> handleInvalidEmailOrPasswordException(
			InvalidEmailOrPasswordException invalidEmailOrPasswordException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NO_CONTENT.value());
		structure.setMessage("Invalid Student Email or Password...");
		structure.setBody(invalidEmailOrPasswordException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(InvalidPhoneOrPasswordException.class)
	public ResponseEntity<ResponseStructure<String>> handleInvalidPhoneOrPasswordException(
			InvalidPhoneOrPasswordException invalidPhoneOrPasswordException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NO_CONTENT.value());
		structure.setMessage("Invalid Student Phone or Password...");
		structure.setBody(invalidPhoneOrPasswordException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler(NoStudentsFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleNoStudentsFoundException(
			NoStudentsFoundException noStudentsFoundException) {
		ResponseStructure<String> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.NO_CONTENT.value());
		structure.setMessage("No Student Found...");
		structure.setBody(noStudentsFoundException.getMessage());
		return new ResponseEntity<>(structure, HttpStatus.NO_CONTENT);
	}

}
