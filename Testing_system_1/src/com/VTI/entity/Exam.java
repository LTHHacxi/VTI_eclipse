package com.VTI.entity;

import java.time.LocalDate;

public class Exam {
	public int id;
	public int code;
	public String title;
	public String categoryExam;
	public int duration;
	public Account creator;
	public LocalDate createDate;
	public Question[] questions;
}
