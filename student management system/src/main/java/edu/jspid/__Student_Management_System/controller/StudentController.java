package edu.jspid.__Student_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jspid.__Student_Management_System.dto.Student;
import edu.jspid.__Student_Management_System.response_structure.ResponseStructure;
import edu.jspid.__Student_Management_System.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService service;

	@PostMapping(value = "/save")
	public ResponseEntity<ResponseStructure<Student>> saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@PutMapping(value = "/update")
	public ResponseEntity<ResponseStructure<Student>> updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}

	@GetMapping(value = "/fetch/{id}")
	public ResponseEntity<ResponseStructure<Student>> findStudent(@PathVariable int id) {
		return service.findStudentById(id);
	}

	@GetMapping(value = "/fetch/{phone}/{password}")
	public ResponseEntity<ResponseStructure<Student>> findStudentByPhoneAndPassword(@PathVariable long phone,
			@PathVariable String password) {
		return service.findStudentByPhoneAndPassword(phone, password);
	}

	@GetMapping(value = "/fetch")
	public ResponseEntity<ResponseStructure<Student>> findStuidentByEmailAndPassword(@RequestParam String email,
			String password) {
		return service.findStudentByEmailAndPassword(email, password);
	}

	@GetMapping(value = "/fetch/all")
	public ResponseEntity<ResponseStructure<List<Student>>> findAllStudent() {
		return service.findAllStudents();
    }

}
