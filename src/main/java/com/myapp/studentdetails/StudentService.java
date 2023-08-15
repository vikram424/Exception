package com.myapp.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.myapp.employee.InvalidAgeException;

//import com.myapp.employee.InvalidAgeException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	
	public String postDetails(Student s)throws InvalidAgeException{
		try {
			if(s.getAge()<18) {
				throw new InvalidAgeException("Enter a valid Age");
			}else {
				return sd.postDetails(s);
			}
			
			}catch(InvalidAgeException ar) {
				return ar.getMessage();
			}
      
	}
	
	public List<Student> getDetails(){
		return sd.getDetails();
	}
	
	public String update(Student s){
		

		return sd.update(s);
	}
	public String delete() {
		return sd.delete();
		
	}
	public Student getByIds(int id) {
		return sd.getByIds(id);
	}
	
}

