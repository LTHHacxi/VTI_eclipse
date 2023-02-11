package com.vti.entity;
//Exercise 4 (Optional): Constructor
	// Question 1:
	// a)
public class Student {
	private int id;
	private String name;
	private String hometown;
	private Float point;
	// b)
	public Student(int id, String name, String hometown) {
		this.id = id;
		this.name = name;
		this.hometown = hometown;
		this.point = (float) 0;
	}
	// c)
	public void setPoint(Float point) {
		this.point = point;
	}
	// d)
	public void PlusPoint(Float point) {
		this.point = this.point + point;
	}
	// e)
	@Override
	public String toString() {
	String rank = null;
if (point<4.0) {
	rank = "Yếu";
} else if (point<6.0) {
	rank = "Trung Bình";
} else if (point<8.0) {
	rank = "Khá";
} else {
	rank = " Giỏi";
}
		return "Student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", Rank" + rank + "]";
	}
}