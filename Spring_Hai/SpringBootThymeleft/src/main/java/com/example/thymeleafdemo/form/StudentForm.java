package com.example.thymeleafdemo.form;

import java.util.Date;

public class StudentForm {
	private String fullName;
	private String birthday;
	private double math;
	private double literature;
	private double english;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getLiterature() {
		return literature;
	}
	public void setLiterature(double literature) {
		this.literature = literature;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
}
