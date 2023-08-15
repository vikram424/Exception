package com.myapp.studentMarkSheet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MarkSheetRepository extends JpaRepository <MarkSheet,Integer>{
	
	@Query(value="select * from mark_sheet where id=?",nativeQuery=true)
	
	public MarkSheet getByIds(int id);

}
