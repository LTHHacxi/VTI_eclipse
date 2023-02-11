package com.vti.entity;

import java.time.LocalDate;

public class Question {
	private int id;
	private String content;
	private CategoryQuestion categoryQS;
	private TypeQuestion typeQS;
	private Account creator;
	private LocalDate createDate;
	private Exam[] exams;
// Exercise 3: Access Modifier
	// Question 1:	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CategoryQuestion getCategoryQS() {
		return categoryQS;
	}
	public void setCategoryQS(CategoryQuestion categoryQS) {
		this.categoryQS = categoryQS;
	}
	public TypeQuestion getTypeQS() {
		return typeQS;
	}
	public void setTypeQS(TypeQuestion typeQS) {
		this.typeQS = typeQS;
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
	public Exam[] getExams() {
		return exams;
	}
	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

}
