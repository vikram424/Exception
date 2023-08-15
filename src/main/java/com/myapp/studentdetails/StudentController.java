package com.myapp.studentdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/post")
	public String postDetails(@RequestBody Student s)throws InvalidAgeException {
		return ss.postDetails(s);
	}
	@GetMapping(value="/get")
	public List<Student> getdetails(){
		return ss.getDetails();
	}
	@PutMapping(value="/update")
	public String update(@RequestBody Student s){
		return ss.update(s);
	}
	@DeleteMapping(value="/delet")
	public String delete() {
		return ss.delete();
	}
	@GetMapping(value="/getid/{id}")
	public Student getByIds(@PathVariable int id) {
		return ss.getByIds(id);
	}

}
