package com.myapp.studentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetDao md;
	
	public String postDetails(MarkSheet m) {
		m.setSem1Total(m.getSem1Practical()+m.getSem1Theory());
		m.setSem2Total(m.getSem2Practical()+m.getSem2Theory());
		
	    return md.postDetails(m);

		}
	
	public String update(MarkSheet s) {
		return md.update(s);
	}
	public List<MarkSheet> getList(){
		return md.getList();
	}
	public String delete() {
		return md.delete();
	}

	public MarkSheet getByIds(int id) {
		return md.getByIds(id);
	}
	
	
}
