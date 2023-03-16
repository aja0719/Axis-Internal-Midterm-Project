package com.axis.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "College")
public class CollegeDetails {
	
	@Id
	private String clgId;
	private String clgName;
	private String clgAddress;
	
	private String courseID;  // DeptID
	private String courseName;  // DeptName
		
	
	public CollegeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollegeDetails(String clgId, String clgName, String clgAddress, String courseID, String courseName) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.clgAddress = clgAddress;
		this.courseID = courseID;
		this.courseName = courseName;
	}
	public String getClgId() {
		return clgId;
	}
	public void setClgId(String clgId) {
		this.clgId = clgId;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getClgAddress() {
		return clgAddress;
	}
	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
