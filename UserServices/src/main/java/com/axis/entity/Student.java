package com.axis.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Users")
public class Student{
	
	
    @Id
    private String id;
	private String name;
	private String gender;
	private LocalDate dob;
	private LocalDate dateOfAdmission;
	private String YearOfStudy;
	private String contact;
	private String email;
	private String password;
	
	@DBRef
	private Fees feesDetails;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String gender, LocalDate dob, LocalDate dateOfAdmission, String yearOfStudy,
			String contact, String email, String password, Fees feesDetails) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.dateOfAdmission = dateOfAdmission;
		YearOfStudy = yearOfStudy;
		this.contact = contact;
		this.email = email;
		this.password = password;
		this.feesDetails = feesDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public String getYearOfStudy() {
		return YearOfStudy;
	}

	public void setYearOfStudy(String yearOfStudy) {
		YearOfStudy = yearOfStudy;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Fees getFeesDetails() {
		return feesDetails;
	}

	public void setFeesDetails(Fees feesDetails) {
		this.feesDetails = feesDetails;
	}

	
}
