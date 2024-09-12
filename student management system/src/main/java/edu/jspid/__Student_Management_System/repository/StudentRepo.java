package edu.jspid.__Student_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jspid.__Student_Management_System.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	Student findByPhoneAndPassword(long phone,String password);
	
	Student findByEmailAndPassword(String email,String password);
	
}
