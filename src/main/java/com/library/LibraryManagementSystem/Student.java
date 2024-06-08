package com.library.LibraryManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int sid;
	private String sName;
	private String address;
	private String college;
	
	private void Student() {
		// TODO Auto-generated method stub

	}

	public Student(int sid, String sName, String address, String college) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.address = address;
		this.college = college;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", address=" + address + ", college=" + college + "]";
	}
	
	

}
