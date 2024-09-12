package edu.jspid.__Student_Management_System.response_structure;

import lombok.Data;

@Data
public class ResponseStructure<T>{
	private int statusCode;
	private String message;
	private T body;

}
