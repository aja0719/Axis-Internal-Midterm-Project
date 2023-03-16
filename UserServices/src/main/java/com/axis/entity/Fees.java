package com.axis.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "fees")
public class Fees {

	@Id
	private String feeId;
	
	private String name;
	
	private double TotalFeesForStudent;
	private String paymentMode;
	private double TotalPaidFeesForStudent;
	private double OutstandingFees;
	private LocalDate paidDate;
	
	private String clgId;
	private String clgName;
	private String clgAddress;
	
	private String depatmentName;  // DeptName
	
	
	public Fees() {
		super();
		
	}


	public Fees(String feeId, String name, double totalFeesForStudent, String paymentMode,
			double totalPaidFeesForStudent, double outstandingFees, LocalDate paidDate, String clgId, String clgName,
			String clgAddress, String depatmentName) {
		super();
		this.feeId = feeId;
		this.name = name;
		TotalFeesForStudent = totalFeesForStudent;
		this.paymentMode = paymentMode;
		TotalPaidFeesForStudent = totalPaidFeesForStudent;
		OutstandingFees = outstandingFees;
		this.paidDate = paidDate;
		this.clgId = clgId;
		this.clgName = clgName;
		this.clgAddress = clgAddress;
		this.depatmentName = depatmentName;
	}


	public String getFeeId() {
		return feeId;
	}


	public void setFeeId(String feeId) {
		this.feeId = feeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getTotalFeesForStudent() {
		return TotalFeesForStudent;
	}


	public void setTotalFeesForStudent(double totalFeesForStudent) {
		TotalFeesForStudent = totalFeesForStudent;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public double getTotalPaidFeesForStudent() {
		return TotalPaidFeesForStudent;
	}


	public void setTotalPaidFeesForStudent(double totalPaidFeesForStudent) {
		TotalPaidFeesForStudent = totalPaidFeesForStudent;
	}


	public double getOutstandingFees() {
		return OutstandingFees;
	}


	public void setOutstandingFees(double outstandingFees) {
		OutstandingFees = outstandingFees;
	}


	public LocalDate getPaidDate() {
		return paidDate;
	}


	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
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


	public String getDepatmentName() {
		return depatmentName;
	}


	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}
	
}
