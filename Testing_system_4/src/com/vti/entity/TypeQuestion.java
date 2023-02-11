package com.vti.entity;



public class TypeQuestion {
	private int id;
	public enum TQname {
		Essay, Multiple_Choice
	}
	private TQname name;
// Exercise 3: Access Modifier
	// Question 1:	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TQname getName() {
		return name;
	}
	public void setName(TQname name) {
		this.name = name;
	}
	
}
