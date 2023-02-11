package com.VTI.frontend;

import java.time.LocalDate;
import java.util.Scanner;

import com.VTI.backend.Exercise_1;
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

public class Program_2 {
	public static void main(String[] args) {
		// tạo instance trong Department
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "sale";

		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Marketing";

		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Human Resources";

		// tạo instance trong Position
		Position po1 = new Position();
		po1.id = 1;
		po1.name = Pname.Dev;

		Position po2 = new Position();
		po2.id = 2;
		po2.name = Pname.Test;

		Position po3 = new Position();
		po3.id = 3;
		po3.name = Pname.Scrum_Master;

		Position po4 = new Position();
		po4.id = 4;
		po4.name = Pname.PM;

		// tạo instance trong Account
		Account ac1 = new Account();
		ac1.id = 1;
		ac1.email = "user1@gmail.com";
		ac1.username = "username1";
		ac1.fullName = "i am user1";
		ac1.department = dep1;
		ac1.position = po1;
		ac1.createDate = LocalDate.now();

//	System.out.println(" Group: "+ ac1.groups[0].name + ac1.groups[1].name);

		Account ac2 = new Account();
		ac2.id = 2;
		ac2.email = "user1@gmai2.com";
		ac2.username = "username2";
		ac2.fullName = "i am user2";
		ac2.department = dep2;
		ac2.position = po2;
		ac2.createDate = LocalDate.of(2021, 03, 15);

//	System.out.println(" Group: "+ ac2.groups[0].name + ac2.groups[1].name + ac2.groups[2].name);

		Account ac3 = new Account();
		ac3.id = 3;
		ac3.email = "user3@gmail.com";
		ac3.username = "username3";
		ac3.fullName = "i am user3";
		ac3.department = dep3;
		ac3.position = po3;
		ac3.createDate = LocalDate.now();

//	System.out.println(" Group: "+ ac3.groups[0].name + ac3.groups[1].name);

		Account ac4 = new Account();
		ac4.id = 4;
		ac4.email = "user4@gmail.com";
		ac4.username = "username4";
		ac4.fullName = "i am user4";
		ac4.department = dep2;
		ac4.position = po4;
		ac4.createDate = LocalDate.now();

//	System.out.println(" Group: ");

		// tạo instance trong group
		Group gr1 = new Group();
		gr1.id = 1;
		gr1.name = "Grname 1";
		gr1.creator = ac1;
		gr1.createDate = LocalDate.now();
		Account[] gr1accounts = { ac1, ac2 };
		gr1.accounts = gr1accounts;

		Group gr2 = new Group();
		gr2.id = 2;
		gr2.name = "Grname 2";
		gr2.creator = ac2;
		gr2.createDate = LocalDate.now();
		Account[] gr2accounts = { ac1, ac2, ac3 };
		gr2.accounts = gr2accounts;

		Group gr3 = new Group();
		gr3.id = 3;
		gr3.name = "Grname 3";
		gr3.creator = ac3;
		gr3.createDate = LocalDate.now();
		Account[] gr3accounts = { ac2, ac3 };
		gr3.accounts = gr3accounts;

//gán group vào account
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

		TypeQuestion tq2 = new TypeQuestion();
		tq2.id = 1;
		tq2.name = TQname.Essay;

		TypeQuestion tq3 = new TypeQuestion();
		tq3.id = 1;
		tq3.name = TQname.Essay;

		TypeQuestion tq4 = new TypeQuestion();
		tq4.id = 1;
		tq4.name = TQname.Essay;

		// tạo instance trong CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Java";

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.id = 1;
		cq2.name = ".NET";

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.id = 1;
		cq3.name = "SQL";

		CategoryQuestion cq4 = new CategoryQuestion();
		cq4.id = 1;
		cq4.name = "Postman";

		// tạo instance trong Question
		Question qs1 = new Question();
		qs1.id = 1;
		qs1.content = "this is content of qs1?";
		qs1.categoryQS = cq3;
		qs1.typeQS = tq4;
		qs1.creator = ac1;
		qs1.createDate = LocalDate.now();

		Question qs2 = new Question();
		qs2.id = 2;
		qs2.content = "this is content of qs2?";
		qs2.categoryQS = cq1;
		qs2.typeQS = tq2;
		qs2.creator = ac2;
		qs2.createDate = LocalDate.now();

		Question qs3 = new Question();
		qs3.id = 3;
		qs3.content = "this is content of qs3?";
		qs3.categoryQS = cq3;
		qs3.typeQS = tq4;
		qs3.creator = ac1;
		qs3.createDate = LocalDate.now();

		Question qs4 = new Question();
		qs4.id = 1;
		qs4.content = "this is content of qs4?";
		qs4.categoryQS = cq2;
		qs4.typeQS = tq1;
		qs4.creator = ac1;
		qs4.createDate = LocalDate.now();

		// tạo instance trong Answer
		Answer as1 = new Answer();
		as1.id = 1;
		as1.content = "this is content of answer for qs1?";
		as1.question = qs1;
		as1.isCorrect = false;

		Answer as2 = new Answer();
		as2.id = 1;
		as2.content = "this is content of answer for qs2?";
		as2.question = qs1;
		as2.isCorrect = true;

		Answer as3 = new Answer();
		as3.id = 1;
		as3.content = "this is content of answer for qs3?";
		as3.question = qs1;
		as3.isCorrect = false;

		Answer as4 = new Answer();
		as4.id = 1;
		as4.content = "this is content of answer for qs4?";
		as4.question = qs1;
		as4.isCorrect = true;

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

		Account[] accArray = { ac1, ac2, ac3, ac4 };
		Department[] depArray = { dep1, dep2, dep3 };
		Department[] depArray2 = { dep1, dep2 };
		Account[] accArray2 = { ac1, ac2, ac3 };
		Department[] depArray3 = { dep1, dep2, dep3 };
		Department[] depArray4 = { dep1, dep3 };
		int i = 1;
		int i1 = 0;

		// Ex1
		Exercise_1 exercise_1 = new Exercise_1();
		exercise_1.question_1(ac2);
		exercise_1.question_2(ac2);
		exercise_1.question_8(accArray);
		exercise_1.question_9(depArray);
		exercise_1.question_10(accArray2);
		exercise_1.question_11(depArray2);
		exercise_1.question_12(depArray3);
		exercise_1.question_13(accArray);
		exercise_1.question_14(accArray);
		exercise_1.question_16(depArray3);
		exercise_1.question_17_11(depArray);
		exercise_1.question_17_12(depArray);
		exercise_1.question_17_13(accArray);
		exercise_1.question_17_14(accArray);

		while (true) {
			Scanner scanner = new Scanner(System.in);
			menu();
			int chose = scanner.nextInt();
			switch (chose) {
			case 1:
				exercise_1.question_1(ac2);
				break;

			case 2:
				exercise_1.question_2(ac2);
				break;

			case 3:
				exercise_1.question_3(ac2);
				break;

			case 4:
				exercise_1.question_4(ac1);
				break;

			case 5:
				exercise_1.question_5(gr1);
				break;

			case 6:
				exercise_1.question_6(ac2);
				break;

			case 7:
				exercise_1.question_7(ac1);
				break;

			case 8:
				exercise_1.question_8(accArray);
				break;

			case 9:
				exercise_1.question_9(depArray);
				break;

			case 10:
				exercise_1.question_10(accArray2);
				break;

			case 11:
				exercise_1.question_11(depArray2);
				break;

			case 12:
				exercise_1.question_12(depArray3);
				break;

			case 13:
				exercise_1.question_13(accArray);
				break;

			case 14:
				exercise_1.question_14(accArray);
				break;

			case 15:
				exercise_1.question_15(i);
				break;

			case 16:
				exercise_1.question_16(depArray3);
				break;

			}
		}

	}

	public static void menu() {
		System.out.println("----------------- MENU -----------------");
		System.out.println("Mời bạn chọn câu hỏi: ");
		System.out.println("1. question 1");
		System.out.println("2. question 2");
	}

}
