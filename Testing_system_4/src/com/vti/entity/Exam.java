package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	private int id;
	private int code;
	private String title;
	private String categoryExam;
	private int duration;
	private Account creator;
	private LocalDate createDate;
	private Question[] questions;
// Exercise 3: Access Modifier
	// Question 1:	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryExam() {
		return categoryExam;
	}
	public void setCategoryExam(String categoryExam) {
		this.categoryExam = categoryExam;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public Question[] getQuestions() {
		return questions;
	}
	public void setQuestions(Question[] questions) {
		this.questions = questions;
	}
	
}
