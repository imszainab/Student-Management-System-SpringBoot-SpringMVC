package edu.jspid.__Student_Management_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import edu.jspid.__Student_Management_System.dao.StudentDao;
import edu.jspid.__Student_Management_System.dto.Student;
import edu.jspid.__Student_Management_System.exception_classes.IdNotFoundException;
import edu.jspid.__Student_Management_System.exception_classes.InvalidEmailOrPasswordException;
import edu.jspid.__Student_Management_System.exception_classes.InvalidPhoneOrPasswordException;
import edu.jspid.__Student_Management_System.exception_classes.NoStudentsFoundException;
import edu.jspid.__Student_Management_System.response_structure.ResponseStructure;


@Service
public class StudentService {
	
	@Autowired
	StudentDao dao;

	public ResponseEntity<ResponseStructure<Student>> saveStudent(Student student) {
		Student dbstudent = dao.saveStudent(student);
		ResponseStructure<Student> structure = new ResponseStructure<>();
		if (dbstudent != null) {
			structure.setStatusCode(HttpStatus.CREATED.value());
			structure.setMessage("Student Saved Successfully...");
			structure.setBody(dbstudent);
			return new ResponseEntity<>(structure, HttpStatus.OK);
		}
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Can't Save Student...");
		structure.setBody(null);
		return new ResponseEntity<>(structure, HttpStatus.NOT_ACCEPTABLE);
	}

	public ResponseEntity<ResponseStructure<Student>> updateStudent(Student student) {
		Student dbstudent = dao.updateStudent(student);
		ResponseStructure<Student> structure = new ResponseStructure<>();
		if (dbstudent != null) {
			structure.setStatusCode(HttpStatus.OK.value());
			structure.setMessage("Student Updated Successfully...");
			structure.setBody(dbstudent);
			return new ResponseEntity<>(structure, HttpStatus.OK);
		}
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Can't Update Student...");
		structure.setBody(null);
		return new ResponseEntity<>(structure, HttpStatus.NOT_ACCEPTABLE);
	}

	public ResponseEntity<ResponseStructure<Student>> findStudentById(int id) {
		Optional<Student> dbstudent = dao.findStudentById(id);
		ResponseStructure<Student> structure = new ResponseStructure<>();
		if (!dbstudent.isPresent())
			throw new IdNotFoundException();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Student Found Successfully...");
		structure.setBody(dbstudent.get());
		return new ResponseEntity<>(structure, HttpStatus.OK);

	}

	public ResponseEntity<ResponseStructure<String>> deleteStudent(int id) {
		Optional<Student> dbstudent = dao.findStudentById(id);
		ResponseStructure<String> structure = new ResponseStructure<>();
		if (!dbstudent.isPresent())
			throw new IdNotFoundException();
		dao.deleteStudent(id);
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Student Deleted Successfully...");
		structure.setBody("Given Student Id Record Deleted Successfully...");
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Student>> findStudentByPhoneAndPassword(long phone, String password) {
		ResponseStructure<Student> structure = new ResponseStructure<>();
		Student dbstudent = dao.findByPhoneAndPassword(phone, password);
		if (dbstudent == null)
			throw new InvalidPhoneOrPasswordException();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Student Found Successfully...");
		structure.setBody(dbstudent);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<Student>> findStudentByEmailAndPassword(String email, String password) {
		ResponseStructure<Student> structure = new ResponseStructure<>();
		Student dbstudent = dao.findByEmailAndPassword(email, password);
		if (dbstudent == null)
			throw new InvalidEmailOrPasswordException();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("Student Found Successfully...");
		structure.setBody(dbstudent);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

	public ResponseEntity<ResponseStructure<List<Student>>> findAllStudents() {
		List<Student> students = dao.findAllStudents();
		if (students.isEmpty())
			throw new NoStudentsFoundException();
		ResponseStructure<List<Student>> structure = new ResponseStructure<>();
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setMessage("All Student's Are Fetched From Database Successfully...");
		structure.setBody(students);
		return new ResponseEntity<>(structure, HttpStatus.OK);
	}

}
