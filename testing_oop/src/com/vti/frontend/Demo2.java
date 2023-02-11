package com.vti.frontend;

import com.vti.entity.Mentor;
import com.vti.entity.Student;

public class Demo2 {
	public static void main(String[] args) {
// Tạo ra mentor
		Mentor mentor1 = new Mentor();
		mentor1.setYearsOfExperience(10);
		mentor1.setId(1);
		mentor1.setName("Daonq1");
		mentor1.setGender("Male");

		System.out.println("-------------------");
		System.out.println("Thông tin Mentor1:");
		System.out.println(mentor1.printInfoCommon());
		System.out.println(mentor1.printYearsOfExperience());

		System.out.println("---------printInfoMentor----------");
		mentor1.printInfoMentor();
//		System.out.println("id:" + mentor1.getId());
//		System.out.println("name:" + mentor1.getName());
//		System.out.println("gender:" + mentor1.getGender());
//		System.out.println("YearsOfExperience:" + mentor1.getYearsOfExperience());
// Tạo thông tin mentor2
		System.out.println("---------Thông tin mentor2----------");
		Mentor mentor2 = new Mentor(2, "daonq2", "Male", 9);
		mentor2.printInfoMentor();

		System.out.println("-------------------");

//		Tạo ra Student
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Student1");
		student1.setGender("Female");
		student1.setJob("IT");

		System.out.println("Thông tin Student1:");
		System.out.println(student1.printInfoCommon());

	}
}