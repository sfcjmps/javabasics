package com.hcl.student.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {
	private int Rollnum;
	private String sName;
	private int Age;
	private String Gender;
	private String Country;
	private Date dateOfJoin;
	private float finalScore;
	
	@Id
	@Column(name = "Rollnum")
	public int getRollnum() {
		return Rollnum;
	}
	public void setRollnum(int rollnum) {
		Rollnum = rollnum;
	}
	
	@Column(name = "name")
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	@Column(name = "Age")
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	@Column(name = "Gender")
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Column(name = "Country")
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	@Column(name = "dateOfJoin")
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	@Column(name = "finalScore")
	public float getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(float finalScore) {
		this.finalScore = finalScore;
	}
	
}
