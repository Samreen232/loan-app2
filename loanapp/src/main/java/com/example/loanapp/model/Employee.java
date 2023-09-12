package com.example.loanapp.model;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.List;

@Entity
@Table(name="employee_master")
public class Employee {
	@Id
	@Column(length=6, nullable=false, unique=true)
	private String employee_id;
	@Column(length=20)
	private String first_name;
	@Column(length=25)
	private String last_name;
	private String email_id;
	private String password;
	private String home_add;
	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date dob;
	private char gender;
	private String phone_num;
	private String designation;
	@Column(length=25)
	private String dept;
	@JsonFormat(shape =JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date doj;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<EmployeeCard> EmployeeCard;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Issue> issue;

	

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHome_add() {
		return home_add;
	}

	public void setHome_add(String home_add) {
		this.home_add = home_add;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public List<EmployeeCard> getEmployeeCard() {
		return EmployeeCard;
	}

	public void setEmployeeCard(List<EmployeeCard> employeeCard) {
		EmployeeCard = employeeCard;
	}

	public List<Issue> getIssue() {
		return issue;
	}

	public void setIssue(List<Issue> issue) {
		this.issue = issue;
	}
	
}

