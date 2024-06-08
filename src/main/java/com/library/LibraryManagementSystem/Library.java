package com.library.LibraryManagementSystem;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Library {
	
	@Id
	private int lid;
	private String lName;
	private String branch;
	@OneToMany
	private List<Student> student;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(int lid, String lName, String branch, List<Student> student) {
		super();
		this.lid = lid;
		this.lName = lName;
		this.branch = branch;
		this.student = student;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lName=" + lName + ", branch=" + branch + ", student=" + student + "]";
	}
	
	
	
	

}
//Library:lid,lname,branch,student
//Student:sid,sname,address,college(CRUD) MenuDriven(One Library Have Many Students)