package com.myapp.studentdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	@Query(value="select * from student where id=?",nativeQuery=true)
	
	public Student getByIds(int id);

}
