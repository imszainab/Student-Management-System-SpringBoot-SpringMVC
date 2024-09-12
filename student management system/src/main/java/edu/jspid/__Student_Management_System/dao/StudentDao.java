package edu.jspid.__Student_Management_System.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jspid.__Student_Management_System.dto.Student;
import edu.jspid.__Student_Management_System.repository.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo stu_repo;
	
	public Student saveStudent(Student student) {
		return stu_repo.save(student);
	}
	
	public Student updateStudent(Student student) {
		return stu_repo.save(student);
	}
	
	public Optional<Student> findStudentById(int id) {
		return stu_repo.findById(id);
	}
	
	public void deleteStudent(int id) {
		stu_repo.deleteById(id);
	}
	
	public List<Student> findAllStudents(){
		return stu_repo.findAll();
	} 
	
	
	//Interface StudentRepo Methods
	public Student findByPhoneAndPassword(long phone,String password) {
		return stu_repo.findByPhoneAndPassword(phone,password);
	}	
	
	public Student findByEmailAndPassword(String email,String password) {
		return stu_repo.findByEmailAndPassword(email,password);
	}
	


}
