package com.myapp.studentMarkSheet;

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
@RequestMapping(value="/markSheet")
public class MarkSheetController {
	@Autowired
	MarkSheetService ms;
	
	@PostMapping(value="/post")
	public String postDetails(@RequestBody MarkSheet m) {

		return ms.postDetails(m);
	}
	@PutMapping(value="/update")
	public String update(@RequestBody MarkSheet n) {
		return ms.update(n);
	}
	@DeleteMapping(value="/del")
	public String delet() {
		return ms.delete();
	}
	@GetMapping(value="/get")
	public List<MarkSheet> getList(){
		return ms.getList();
	}
	@GetMapping(value="/getbyId/{id}")
	public MarkSheet getByIds(@PathVariable int id) {
		return ms.getByIds(id);
	}
	

}
