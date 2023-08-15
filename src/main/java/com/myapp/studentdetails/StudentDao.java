package com.myapp.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository sRepo;
	
	public String postDetails(Student s ) {
		sRepo.save(s);
		
		
		return "Saved";
		
	}
	public List<Student> getDetails(){
		return sRepo.findAll();
	}
	
	public String update(Student s){
		 sRepo.save(s);
		 return "Saved";
	}
	public String delete() {
		sRepo.deleteAll();
		return "Deleted";
	}
	public Student getByIds(int id) {
		return sRepo.getByIds(id);
	}

}
