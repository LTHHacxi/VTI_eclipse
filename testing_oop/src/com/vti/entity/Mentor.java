package com.vti.entity;

public class Mentor extends Staff {
	private int yearsOfExperience;

	public Mentor() {
		super(); // Gọi hàm tạo của cha
//		Staff();
	}
//

	public Mentor(int id, String name, String gender, int yearsOfExperience) {
		super(id, name, gender); // Tạo các thuộc tính lớp cha
		this.yearsOfExperience = yearsOfExperience;
	}

	// Khai báo ra hàm Setter
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	// Khai báo hàm getter
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

//
	public String printYearsOfExperience() {
		return "yearsOfExperience= " + this.yearsOfExperience;
	}

//	Hàm in thông tin của Mentor
//	id, name, gender, yearsOfExperience
	public void printInfoMentor() {
		System.out.println("Thông tin của mentor là:");
		System.out.println("Số năm kinh nghiệm: " + this.yearsOfExperience);
		System.out.println("Id: " + super.getId()); // super.id

		System.out.println("name: " + super.getName());
		System.out.println("gender: " + super.getGender());
	}
}