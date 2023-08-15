package com.myapp.studentMarkSheet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="markSheet")
public class MarkSheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public int rollNo;
	public int sem1Theory;
	public int sem1Practical;
	public int sem1Total;
	public int sem2Theory;
	public int sem2Practical;
	public int sem2Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getSem1Theory() {
		return sem1Theory;
	}
	public void setSem1Theory(int sem1Theory) {
		this.sem1Theory = sem1Theory;
	}
	public int getSem1Practical() {
		return sem1Practical;
	}
	public void setSem1Practical(int sem1Practical) {
		this.sem1Practical = sem1Practical;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Theory() {
		return sem2Theory;
	}
	public void setSem2Theory(int sem2Theory) {
		this.sem2Theory = sem2Theory;
	}
	public int getSem2Practical() {
		return sem2Practical;
	}
	public void setSem2Practical(int sem2Practical) {
		this.sem2Practical = sem2Practical;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}
	
	

}
