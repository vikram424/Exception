package com.myapp.studentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarkSheetDao {
	@Autowired
	MarkSheetRepository mRepo;
	
	public String postDetails(MarkSheet m) {
		mRepo.save(m);
		return "Savaed";
	}
	public String update(MarkSheet n) {
		mRepo.save(n);
		return "update";
	}
	public String delete() {
		mRepo.deleteAll();
		return "Deleted";
	}
	public List<MarkSheet> getList(){
		return mRepo.findAll();
	}
	public MarkSheet getByIds(int id) {
		return mRepo.getByIds(id);
	}

}
