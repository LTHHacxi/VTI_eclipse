package com.vti.entity;

// Supper Class
public class Staff {
	private int id;
	private String name;
	private String gender;

//	Khai báo Setter
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

//	Khai báo Getter
	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;

	}


//	Viết hàm in thông tin

	public Staff(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public String printInfoCommon() {
		return "ID= " + this.id + " ,Name= " + this.name + " ,Gender= " + this.gender;
	}

//	
}