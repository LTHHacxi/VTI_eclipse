package com.vti.entity;

import java.time.LocalDate;

import com.vti.entity.Position;
import com.vti.entity.Group;

public class Account {
	private int id;
	private String email;
	private String username;
	private String fullName;
	private Position position;
	private Department department;
	private LocalDate createDate;
	private Group[] groups;
// Exercise 1 (Optional): Constructor
	// Question 2:
	// a)không có parameters
	public Account() {

	}

	// b) Có các parameter là id, Email, Username, FirstName,LastName (với FullName
	// = FirstName + LastName)
	public Account(int id, String email, String username, String FirstName, String LastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
	}

	// c)
	public Account(int id, String email, String username, String FirstName, String LastName, Position position) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	// d)
	public Account(int id, String email, String username, String FirstName, String LastName, Position position,
			LocalDate creatDate) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullName = FirstName + " " + LastName;
		this.position = position;
		this.createDate = creatDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullName + "]";
	}
// Exercise 3: Access Modifier
	// Question 1:

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	
	
	
}
