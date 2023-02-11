package com.VTI.frontend;

import java.time.LocalDate;
import java.util.Scanner;

import com.VTI.entity.Account;
import com.VTI.entity.Answer;
import com.VTI.entity.CategoryQuestion;
import com.VTI.entity.Department;
import com.VTI.entity.Exam;
import com.VTI.entity.Group;
import com.VTI.entity.Position;
import com.VTI.entity.Position.Pname;
import com.VTI.entity.Question;
import com.VTI.entity.TypeQuestion;
import com.VTI.entity.TypeQuestion.TQname;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// tạo instance trong Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "sale";

		System.out.println("Thông tin phòng ban số 1:");
		System.out.println("ID:" + dep1.id);
		System.out.println("Name:" + dep1.name);

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketing";

		System.out.println("Thông tin phòng ban số 2:");
		System.out.println("ID:" + dep2.id);
		System.out.println("Name:" + dep2.name);

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Human Resources";

		System.out.println("Thông tin phòng ban số 3:");
		System.out.println("ID:" + dep3.id);
		System.out.println("Name:" + dep3.name);

		// tạo instance trong Position
		Position po1 = new Position();
		po1.id = 1;
		po1.name = Pname.Dev;

		System.out.println("Thông tin chức vụ vị trí 1:");
		System.out.println("ID:" + po1.id);
		System.out.println("Name:" + po1.name);

		Position po2 = new Position();
		po2.id = 2;
		po2.name = Pname.Test;

		System.out.println("Thông tin chức vụ vị trí 2:");
		System.out.println("ID:" + po2.id);
		System.out.println("Name:" + po2.name);

		Position po3 = new Position();
		po3.id = 3;
		po3.name = Pname.Scrum_Master;

		System.out.println("Thông tin chức vụ vị trí 3:");
		System.out.println("ID:" + po3.id);
		System.out.println("Name:" + po3.name);

		Position po4 = new Position();
		po4.id = 4;
		po4.name = Pname.PM;

		System.out.println("Thông tin chức vụ vị trí 4:");
		System.out.println("ID:" + po4.id);
		System.out.println("Name:" + po4.name);

		// tạo instance trong Account
		Account ac1 = new Account();
		ac1.id = 1;
		ac1.email = "user1@gmail.com";
		ac1.username = "username1";
		ac1.fullName = "i am user1";
		ac1.department = dep1;
		ac1.position = po1;
		ac1.createDate = LocalDate.now();

		System.out.println("Thông tin Account 1:");
		System.out.println("ID:" + ac1.id);
		System.out.println("Email:" + ac1.email);
		System.out.println("Username:" + ac1.username);
		System.out.println("Name:" + ac1.fullName);
		System.out.println("DepartmentName:" + ac1.department.name);
		System.out.println("PositionName:" + ac1.position.name);
		System.out.println("Date:" + ac1.createDate);
//		System.out.println(" Group: "+ ac1.groups[0].name + ac1.groups[1].name);

		Account ac2 = new Account();
		ac2.id = 2;
		ac2.email = "user1@gmai2.com";
		ac2.username = "username2";
		ac2.fullName = "i am user2";
		ac2.department = dep2;
		ac2.position = po2;
		ac2.createDate = LocalDate.of(2021, 03, 15);

		System.out.println("Thông tin Account 2:");
		System.out.println("ID:" + ac2.id);
		System.out.println("Email:" + ac2.email);
		System.out.println("Username:" + ac2.username);
		System.out.println("Name:" + ac2.fullName);
		System.out.println("DepartmentName:" + ac2.department.name);
		System.out.println("PositionName:" + ac2.position.name);
		System.out.println("Date:" + ac2.createDate);
//		System.out.println(" Group: "+ ac2.groups[0].name + ac2.groups[1].name + ac2.groups[2].name);

		Account ac3 = new Account();
		ac3.id = 3;
		ac3.email = "user3@gmail.com";
		ac3.username = "username3";
		ac3.fullName = "i am user3";
		ac3.department = dep3;
		ac3.position = po3;
		ac3.createDate = LocalDate.now();

		System.out.println("Thông tin Account 3:");
		System.out.println("ID:" + ac3.id);
		System.out.println("Email:" + ac3.email);
		System.out.println("Username:" + ac3.username);
		System.out.println("Name:" + ac3.fullName);
		System.out.println("DepartmentName:" + ac3.department.name);
		System.out.println("PositionName:" + ac3.position.name);
		System.out.println("Date:" + ac3.createDate);
//		System.out.println(" Group: "+ ac3.groups[0].name + ac3.groups[1].name);

		Account ac4 = new Account();
		ac4.id = 4;
		ac4.email = "user4@gmail.com";
		ac4.username = "username4";
		ac4.fullName = "i am user4";
		ac4.department = dep2;
		ac4.position = po4;
		ac4.createDate = LocalDate.now();

		System.out.println("Thông tin Account 4:");
		System.out.println("ID:" + ac4.id);
		System.out.println("Email:" + ac4.email);
		System.out.println("Username:" + ac4.username);
		System.out.println("Name:" + ac4.fullName);
		System.out.println("DepartmentName:" + ac4.department.name);
		System.out.println("PositionName:" + ac4.position.name);
		System.out.println("Date:" + ac4.createDate);
//		System.out.println(" Group: ");

		// tạo instance trong group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Grname 1";
		gr1.creator = ac1;
		gr1.createDate = LocalDate.now();
		Account[] gr1accounts = { ac1, ac2 };
		gr1.accounts = gr1accounts;

		System.out.println("Thông tin Group 1:");
		System.out.println("ID:" + gr1.id);
		System.out.println("Name:" + gr1.name);
		System.out.println("UserOfCreator:" + gr1.creator.username);
		System.out.println("Date:" + gr1.createDate);

		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "Grname 2";
		gr2.creator = ac2;
		gr2.createDate = LocalDate.now();
		Account[] gr2accounts = { ac1, ac2, ac3 };
		gr2.accounts = gr2accounts;

		System.out.println("Thông tin Group 2:");
		System.out.println("ID:" + gr2.id);
		System.out.println("Name:" + gr2.name);
		System.out.println("UserOfCreator:" + gr2.creator.username);
		System.out.println("Date:" + gr2.createDate);

		Group gr3 = new Group();
		gr3.id = 3;
		gr3.name = "Grname 3";
		gr3.creator = ac3;
		gr3.createDate = LocalDate.now();
		Account[] gr3accounts = { ac2, ac3 };
		gr3.accounts = gr3accounts;

		System.out.println("Thông tin Group 3:");
		System.out.println("ID:" + gr3.id);
		System.out.println("Name:" + gr3.name);
		System.out.println("UserOfCreator:" + gr3.creator.username);
		System.out.println("Date:" + gr3.createDate);
// gán group vào account
		// cách 1
		Group[] ac1Groups = new Group[2];
		ac1Groups[0] = gr1;
		ac1Groups[1] = gr2;
		ac1.groups = ac1Groups;
		// cách 2
		Group[] ac2Groups = { gr1, gr2, gr3 };
		ac2.groups = ac2Groups;
		// cách 3
		ac3.groups = new Group[] { gr2, gr3 };
		// tạo instance trong TypeQuestion

		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = TQname.Essay;

		System.out.println("Thông tin kiểu question 1:");
		System.out.println("ID:" + tq1.id);
		System.out.println("TypeName:" + tq1.name);

		TypeQuestion tq2 = new TypeQuestion();
		tq2.id = 1;
		tq2.name = TQname.Essay;

		System.out.println("Thông tin kiểu question 2:");
		System.out.println("ID:" + tq2.id);
		System.out.println("TypeName:" + tq2.name);

		TypeQuestion tq3 = new TypeQuestion();
		tq3.id = 1;
		tq3.name = TQname.Essay;

		System.out.println("Thông tin kiểu question 3:");
		System.out.println("ID:" + tq3.id);
		System.out.println("TypeName:" + tq3.name);

		TypeQuestion tq4 = new TypeQuestion();
		tq4.id = 1;
		tq4.name = TQname.Essay;

		System.out.println("Thông tin kiểu question 4:");
		System.out.println("ID:" + tq4.id);
		System.out.println("TypeName:" + tq4.name);

		// tạo instance trong CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Java";

		System.out.println("Thông tin chủ đề câu hỏi số 1:");
		System.out.println("ID:" + cq1.id);
		System.out.println("CategoryName:" + cq1.name);

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 1;
		cq2.name = ".NET";

		System.out.println("Thông tin chủ đề câu hỏi số 2:");
		System.out.println("ID:" + cq2.id);
		System.out.println("CategoryName:" + cq2.name);

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 1;
		cq3.name = "SQL";

		System.out.println("Thông tin chủ đề câu hỏi số 3:");
		System.out.println("ID:" + cq3.id);
		System.out.println("CategoryName:" + cq3.name);

		CategoryQuestion cq4 = new CategoryQuestion();
		cq4.id = 1;
		cq4.name = "Postman";

		System.out.println("Thông tin chủ đề câu hỏi số 4:");
		System.out.println("ID:" + cq4.id);
		System.out.println("CategoryName:" + cq4.name);

		// tạo instance trong Question
		Question qs1 = new Question();
		qs1.id = 1;
		qs1.content = "this is content of qs1?";
		qs1.categoryQS = cq3;
		qs1.typeQS = tq4;
		qs1.creator = ac1;
		qs1.createDate = LocalDate.now();

		System.out.println("Thông tin Question 1:");
		System.out.println("ID:" + qs1.id);
		System.out.println("Content:" + qs1.content);
		System.out.println("Category:" + qs1.categoryQS.name);
		System.out.println("Type:" + qs1.typeQS.name);
		System.out.println("Creator:" + qs1.creator.fullName);
		System.out.println("Date:" + qs1.createDate);

		Question qs2 = new Question();
		qs2.id = 2;
		qs2.content = "this is content of qs2?";
		qs2.categoryQS = cq1;
		qs2.typeQS = tq2;
		qs2.creator = ac2;
		qs2.createDate = LocalDate.now();

		System.out.println("Thông tin Question 2:");
		System.out.println("ID:" + qs2.id);
		System.out.println("Content:" + qs2.content);
		System.out.println("Category:" + qs2.categoryQS.name);
		System.out.println("Type:" + qs2.typeQS.name);
		System.out.println("Creator:" + qs2.creator.fullName);
		System.out.println("Date:" + qs2.createDate);

		Question qs3 = new Question();
		qs3.id = 3;
		qs3.content = "this is content of qs3?";
		qs3.categoryQS = cq3;
		qs3.typeQS = tq4;
		qs3.creator = ac1;
		qs3.createDate = LocalDate.now();

		System.out.println("Thông tin Question 3:");
		System.out.println("ID:" + qs3.id);
		System.out.println("Content:" + qs3.content);
		System.out.println("Category:" + qs3.categoryQS.name);
		System.out.println("Type:" + qs3.typeQS.name);
		System.out.println("Creator:" + qs3.creator.fullName);
		System.out.println("Date:" + qs3.createDate);

		Question qs4 = new Question();
		qs4.id = 1;
		qs4.content = "this is content of qs4?";
		qs4.categoryQS = cq2;
		qs4.typeQS = tq1;
		qs4.creator = ac1;
		qs4.createDate = LocalDate.now();

		System.out.println("Thông tin Question 4:");
		System.out.println("ID:" + qs4.id);
		System.out.println("Content:" + qs4.content);
		System.out.println("Category:" + qs4.categoryQS.name);
		System.out.println("Type:" + qs4.typeQS.name);
		System.out.println("Creator:" + qs4.creator.fullName);
		System.out.println("Date:" + qs4.createDate);

		// tạo instance trong Answer
		Answer as1 = new Answer();
		as1.id = 1;
		as1.content = "this is content of answer for qs1?";
		as1.question = qs1;
		as1.isCorrect = false;

		System.out.println("Thông tin Answer 1:");
		System.out.println("ID:" + as1.id);
		System.out.println("Content:" + as1.content);
		System.out.println("QuestionID:" + as1.question.id);
		System.out.println("True Or False:" + as1.isCorrect);

		Answer as2 = new Answer();
		as2.id = 1;
		as2.content = "this is content of answer for qs2?";
		as2.question = qs1;
		as2.isCorrect = true;

		System.out.println("Thông tin Answer 2:");
		System.out.println("ID:" + as2.id);
		System.out.println("Content:" + as2.content);
		System.out.println("QuestionID:" + as2.question.id);
		System.out.println("True Or False:" + as2.isCorrect);

		Answer as3 = new Answer();
		as3.id = 1;
		as3.content = "this is content of answer for qs3?";
		as3.question = qs1;
		as3.isCorrect = false;

		System.out.println("Thông tin Answer 3:");
		System.out.println("ID:" + as3.id);
		System.out.println("Content:" + as3.content);
		System.out.println("QuestionID:" + as3.question.id);
		System.out.println("True Or False:" + as3.isCorrect);

		Answer as4 = new Answer();
		as4.id = 1;
		as4.content = "this is content of answer for qs4?";
		as4.question = qs1;
		as4.isCorrect = true;

		System.out.println("Thông tin Answer 4:");
		System.out.println("ID:" + as4.id);
		System.out.println("Content:" + as4.content);
		System.out.println("QuestionID:" + as4.question.id);
		System.out.println("True Or False:" + as4.isCorrect);

		// tạo instance trong Exam
		Exam ex1 = new Exam();
		ex1.id = 1;
		ex1.code = 100;
		ex1.title = "title1";
		ex1.categoryExam = "CategoryExam1";
		ex1.duration = 90;
		ex1.creator = ac1;
		ex1.createDate = LocalDate.now();
		Question[] ex1questions = { qs1, qs2 };
		ex1.questions = ex1questions;

		System.out.println("Thông tin Exam 1:");
		System.out.println("ID:" + ex1.id);
		System.out.println("Code:" + ex1.code);
		System.out.println("Title:" + "title1");
		System.out.println("CategoryExam:" + ex1.categoryExam);
		System.out.println("Duration:" + ex1.duration);
		System.out.println("Creator:" + ac1.username);
		System.out.println("Date:" + ex1.createDate);
//		System.out.println("QuestionID: "+ ex1.questions[0].id + ex1.questions[1].id);

		// Testing system 2
// Exercise 1 - Question 1
		System.out.println("--------------Exercise 1 - Question 1--------------");

		if (ac2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + ac2.department.name);
		}
// Exercise 1 - Question 2
		System.out.println("--------------Exercise 1 - Question 2--------------");
		if (ac2.groups.length == 0) {
			System.out.println("Nhân viên này chưa cố group");
		} else if (ac2.groups.length == 1) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (ac2.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (ac2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

// Exercise 1 - Question 3
		System.out.println("--------------Exercise 1 - Question 3--------------");
		System.out.println(ac2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + ac2.department.name);

// Exercise 1 - Question 4
		System.out.println("--------------Exercise 1 - Question 4--------------");
		System.out.println(ac1.position.name == Pname.Dev ? "Đây là Developer" : "Người này không phải là Developer");

// Exercise 1 - Question 5
		System.out.println("--------------Exercise 1 - Question 5--------------");
		if (gr1.accounts == null) {
			System.out.println("Nhóm chưa có thành viên");
		} else {

			switch (gr1.accounts.length) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");

				break;
			}
		}
// Exercise 1 - Question 6
		System.out.println("--------------Exercise 1 - Question 6--------------");
		switch (ac2.groups.length) {
		case 0:
			System.out.println("Nhân viên này chưa cố group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là :" + ac2.groups[0].name);
			break;
		case 2:
			System.out.println("Group của nhân viên này là  :" + ac2.groups[0].name + ac2.groups[1].name);
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
// Exercise 1 - Question 7
		System.out.println("--------------Exercise 1 - Question 7--------------");
		switch (ac1.position.name.toString()) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
// Exercise 1 - Question 8
		System.out.println("--------------Exercise 1 - Question 8--------------");
		Account[] accArray = { ac1, ac2, ac3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.id + " Email: " + account.email + " Name: " + account.fullName);
		}
// Exercise 1 - Question 9
		System.out.println("--------------Exercise 1 - Question 9--------------");
		Department[] depArray = { dep1, dep2, dep3 };
		for (Department department : depArray) {
			System.out.println("AccountID: " + department.id + " Name: " + department.name);
		}
// Exercise 1 - Question 10
		System.out.println("--------------Exercise 1 - Question 10--------------");
		// for
		Account[] accArray2 = { ac1, ac2, ac3 };
		for (int i = 0; i < accArray2.length; i = i + 1) {
			System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
			System.out.println("Email: " + accArray2[i].email);
			System.out.println("Full name: " + accArray2[i].fullName);
			System.out.println("Phòng ban: " + accArray2[i].department.name);
		}
		// for each (lấy từ đầu đến cuối)
		System.out.println("-------------------");
		for (Account account : accArray2) {
			System.out.println("Thông tin account là: ");
			System.out.println("Email: " + account.email);
			System.out.println("Full name: " + account.fullName);
			System.out.println("Phòng ban: " + account.department.name);
		}
// Exercise 1 - Question 11
		System.out.println("--------------Exercise 1 - Question 11--------------");
		Department[] depArray2 = { dep1, dep2 };
		for (int i = 0; i < depArray2.length; i = i + 1) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("Id: " + depArray2[i].id);
			System.out.println("Name: " + depArray2[i].name);
		}

// Exercise 1 - Question 12
		System.out.println("--------------Exercise 1 - Question 12--------------");
		Department[] depArray3 = { dep1, dep2, dep3 };
		for (int i = 0; i < 2; i = i + 1) {
			System.out.println("Thông tin Department thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + depArray3[i].id);
			System.out.println("Full name: " + depArray3[i].name);
		}

// Exercise 1 - Question 13
		System.out.println("--------------Exercise 1 - Question 13--------------");
		Account[] accArray4 = { ac1, ac2, ac3, ac4 };
		for (int i = 0; i < accArray4.length; i = i + 1) {
			if (i != 1) {
				System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
				System.out.println("Email: " + accArray4[i].email);
				System.out.println("Full name: " + accArray4[i].fullName);
				System.out.println("Phòng ban: " + accArray4[i].department.name);
			}
		}
// Exercise 1 - Question 14
		System.out.println("--------------Exercise 1 - Question 14--------------");
		for (int i1 = 0; i1 < accArray.length; i1++) {
			if (accArray[i1].id < 4) {
				System.out.println("Thông tin account: ");
				System.out.println("Id: " + accArray[i1].id);
				System.out.println("Name: " + accArray[i1].email);
				System.out.println("Name: " + accArray[i1].fullName);
				System.out.println("Name: " + accArray[i1].username);
			}
		}

// Exercise 1 - Question 15
		System.out.println("--------------Exercise 1 - Question 15--------------");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}

// Exercise 1 - Question 16
		System.out.println("--------------Exercise 1 - Question 16--------------");
		Department[] depArray4 = { dep1, dep3 };
		int i1 = 0;
		while (i1 < depArray4.length) {
			System.out.println("Thông tin department thứ" + (i1 + 1) + "là: ");
			System.out.println("Id: " + depArray4[i1].id);
			System.out.println("Name: " + depArray4[i1].name);
			i1 = i1 + 1;
		}
// Exercise 1 - Question 17
		System.out.println("--------------Exercise 1 - Question 17--------------");
//		Question 17-10
		System.out.println("--------------Exercise 1 - Question 17-10--------------");
		Account[] accArray3 = { ac1, ac2, ac3, ac4 };
		int i = 0;
		do {
			System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
			System.out.println("Email: " + accArray3[i].email);
			System.out.println("Full name: " + accArray3[i].fullName);
			System.out.println("Phòng ban: " + accArray3[i].department.name);
			i++;
		} while (i < accArray3.length);

//		Question 17-11
		System.out.println("--------------Exercise 1 - Question 17-11--------------");
		Department[] depArray5 = { dep1, dep2 };
		int i11 = 0;
		do {
			System.out.println("Thông tin department thứ " + (i11 + 1) + " là: ");
			System.out.println("Id: " + depArray2[i11].id);
			System.out.println("Name: " + depArray2[i11].name);
			i11++;
		} while (i11 < depArray5.length);

//		Question 17-12
		System.out.println("--------------Exercise 1 - Question 17-12--------------");
		Department[] depArray6 = { dep1, dep2, dep3 };
		int e = 0;
		do {
			System.out.println("Thông tin Department thứ " + (e + 1) + " là: ");
			System.out.println("Email: " + depArray6[e].id);
			System.out.println("Full name: " + depArray6[e].name);
			e++;

		} while (e < 2);

//		Question 17-13
		System.out.println("--------------Exercise 1 - Question 17-13--------------");
		Account[] accArray1 = { ac1, ac2, ac3, ac4 };
		int q = 0;

		do {
			if (q != 1) {

				System.out.println("Thông tin account thứ " + (q + 1) + " là: ");
				System.out.println("Email: " + accArray1[q].email);
				System.out.println("Full name: " + accArray1[q].fullName);
				System.out.println("Phòng ban: " + accArray1[q].department.name);
			}
			q++;
		} while (q < accArray1.length);

//		Question 17-14
		System.out.println("--------------Exercise 1 - Question 17-14--------------");
		int r = 0;
		Account[] accArray5 = { ac1, ac2, ac3, ac4 };
		do {
			if (accArray5[r].id < 4) {
				System.out.println("Thông tin account: ");
				System.out.println("Id: " + accArray[r].id);
				System.out.println("Name: " + accArray[r].email);
				System.out.println("Name: " + accArray[r].fullName);
				System.out.println("Name: " + accArray[r].username);
			}
			r++;

		} while (r < accArray5.length);

//		Question 17-15
		System.out.println("--------------Exercise 1 - Question 17-15--------------");
		int y = 0;

		do {
			if (y % 2 == 0) {
				System.out.print(y);
			}
			y++;
		} while (y <= 20);

// Exercise 2 - Question 1	

//		while (true) {
//			System.out.println("+-----------------MENU---------------+");
//						// dấu - để căng dòng
//						// 36 là số kí tự tối thiểu trong cả dòng này
//						// %n để xuống dòng
//						System.out.printf("|%-36s|%n", "Mời bạn chọn Exercise cần xem: ");
//						System.out.printf("|%-36s|%n", "1. Exercise 1");
//						System.out.printf("|%-36s|%n", "2. Exercise 2");
//						System.out.println("+------------------------------------+")
//			            int exercise = scanner.nextInt();
//			            if (exercise == 1) {
//			                while (true) {
//			                    System.out.println("Mời bạn chọn Question cần xem (gõ từ 1 đến 17) ");
//			                    int questionex1 = scanner.nextInt();
//			                    if (questionex1 == 1) {
//			                		
//			                		}else if (questionex1 == 2) {
//										
//									}
//			                        if (question == 17) {
//			                            while (true) {
//			                                System.out.println("Mời bạn chọn câu hỏi con (gõ từ 17.10 đến 17.15) ");
//			                                int subQuestion = sc.nextInt();
//			                                if (subQuestion >= 17.10 && subQuestion <= 17.15) {
//			                                    //show code tương ứng với từng subQuestion
//			                                } else {
//			                                    System.out.println("Mời bạn chọn lại");
//			                                }
//			                            }
//			                        }
//			                        break;
//			                    } else {
//			                        System.out.println("Mời bạn chọn lại");
//			                    }
//			                }
//			                break;
//			            } else if (exercise == 2) {
//			                System.out.println("Vẫn chưa cập nhật câu trả lời.");
//			                break;
//			            } else {
//			                System.out.println("Mời bạn chọn lại");
//			         
//			      
//			            }		       
//}
	}
}
