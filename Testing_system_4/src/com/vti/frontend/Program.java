package com.vti.frontend;

import java.time.LocalDate;
import java.util.Scanner;

import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Question;
import com.vti.entity.Student;
import com.vti.entity.TypeQuestion;
import com.vti.entity.Position.Pname;
import com.vti.entity.TypeQuestion.TQname;
import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Position;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// tạo instance trong Department
		Department dep1 = new Department();
		dep1.setId(1);
		dep1.setName("sale");

		System.out.println("Thông tin phòng ban số 1:");
		System.out.println("ID:" + dep1.getId());
		System.out.println("Name:" + dep1.getName());

		Department dep2 = new Department();
		dep2.setId(2);
		dep2.setName("Marketing");

		System.out.println("Thông tin phòng ban số 2:");
		System.out.println("ID:" + dep2.getId());
		System.out.println("Name:" + dep2.getName());

		Department dep3 = new Department();
		dep3.setId(3);
		dep3.setName("Human Resources");

		System.out.println("Thông tin phòng ban số 3:");
		System.out.println("ID:" + dep3.getId());
		System.out.println("Name:" + dep3.getName());

		// tạo instance trong Position
		Position po1 = new Position();
		po1.setId(1);
		po1.setName(Pname.Dev);

		System.out.println("Thông tin chức vụ vị trí 1:");
		System.out.println("ID:" + po1.getId());
		System.out.println("Name:" + po1.getName());

		Position po2 = new Position();
		po2.setId(2);
		po2.setName(Pname.Test);

		System.out.println("Thông tin chức vụ vị trí 2:");
		System.out.println("ID:" + po2.getId());
		System.out.println("Name:" + po2.getName());

		Position po3 = new Position();
		po3.setId(3);
		po3.setName(Pname.Scrum_Master);

		System.out.println("Thông tin chức vụ vị trí 3:");
		System.out.println("ID:" + po3.getId());
		System.out.println("Name:" + po3.getName());

		Position po4 = new Position();
		po4.setId(4);
		po4.setName(Pname.PM);

		System.out.println("Thông tin chức vụ vị trí 4:");
		System.out.println("ID:" + po4.getId());
		System.out.println("Name:" + po4.getName());

		// tạo instance trong Account
		Account ac1 = new Account();
		ac1.setId(1);
		ac1.setEmail("user1@gmail.com");
		ac1.setUsername("username1");
		ac1.setFullName("i am user1");
		ac1.setDepartment(dep1);
		ac1.setPosition(po1);
		ac1.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Account 1:");
		System.out.println("ID:" + ac1.getId());
		System.out.println("Email:" + ac1.getEmail());
		System.out.println("Username:" + ac1.getUsername());
		System.out.println("Name:" + ac1.getFullName());
		System.out.println("DepartmentName:" + ac1.getDepartment().getName());
		System.out.println("PositionName:" + ac1.getPosition().getName());
		System.out.println("Date:" + ac1.getCreateDate());
//		System.out.println(" Group: "+ ac1.groups[0].name + ac1.groups[1].name);

		Account ac2 = new Account();
		ac2.setId(2);
		ac2.setEmail("user1@gmai2.com");
		ac2.setUsername("username2");
		ac2.setFullName("i am user2");
		ac2.setDepartment(dep2);
		ac2.setPosition(po2);
		ac2.setCreateDate(LocalDate.of(2021, 03, 15));

		System.out.println("Thông tin Account 2:");
		System.out.println("ID:" + ac2.getId());
		System.out.println("Email:" + ac2.getEmail());
		System.out.println("Username:" + ac2.getUsername());
		System.out.println("Name:" + ac2.getFullName());
		System.out.println("DepartmentName:" + ac2.getDepartment().getName());
		System.out.println("PositionName:" + ac2.getPosition().getName());
		System.out.println("Date:" + ac2.getCreateDate());
//		System.out.println(" Group: "+ ac2.groups[0].name + ac2.groups[1].name + ac2.groups[2].name);

		Account ac3 = new Account();
		ac3.setId(3);
		ac3.setEmail("user3@gmail.com");
		ac3.setUsername("username3");
		ac3.setFullName("i am user3");
		ac3.setDepartment(dep3);
		ac3.setPosition(po3);
		ac3.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Account 3:");
		System.out.println("ID:" + ac3.getId());
		System.out.println("Email:" + ac3.getEmail());
		System.out.println("Username:" + ac3.getUsername());
		System.out.println("Name:" + ac3.getFullName());
		System.out.println("DepartmentName:" + ac3.getDepartment().getName());
		System.out.println("PositionName:" + ac3.getPosition().getName());
		System.out.println("Date:" + ac3.getCreateDate());
//		System.out.println(" Group: "+ ac3.groups[0].name + ac3.groups[1].name);

		Account ac4 = new Account();
		ac4.setId(4);
		ac4.setEmail("user4@gmail.com");
		ac4.setUsername("username4");
		ac4.setFullName("i am user4");
		ac4.setDepartment(dep2);
		ac4.setPosition(po4);
		ac4.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Account 4:");
		System.out.println("ID:" + ac4.getId());
		System.out.println("Email:" + ac4.getEmail());
		System.out.println("Username:" + ac4.getUsername());
		System.out.println("Name:" + ac4.getFullName());
		System.out.println("DepartmentName:" + ac4.getDepartment().getName());
		System.out.println("PositionName:" + ac4.getPosition().getName());
		System.out.println("Date:" + ac4.getCreateDate());
//		System.out.println(" Group: ");

		// tạo instance trong group
		Group gr1 = new Group();
		gr1.setId(1);
		gr1.setName("Grname 1");
		gr1.setCreator(ac1);
		gr1.setCreateDate(LocalDate.now());
		Account[] gr1accounts = { ac1, ac2 };
		gr1.setAccounts(gr1accounts);

		System.out.println("Thông tin Group 1:");
		System.out.println("ID:" + gr1.getId());
		System.out.println("Name:" + gr1.getName());
		System.out.println("UserOfCreator:" + gr1.getCreator().getUsername());
		System.out.println("Date:" + gr1.getCreateDate());

		Group gr2 = new Group();
		gr2.setId(2);
		gr2.setName("Grname 2");
		gr2.setCreator(ac2);
		gr2.setCreateDate(LocalDate.now());
		Account[] gr2accounts = { ac1, ac2, ac3 };
		gr2.setAccounts(gr2accounts);

		System.out.println("Thông tin Group 2:");
		System.out.println("ID:" + gr2.getId());
		System.out.println("Name:" + gr2.getName());
		System.out.println("UserOfCreator:" + gr2.getCreator().getUsername());
		System.out.println("Date:" + gr2.getCreateDate());

		Group gr3 = new Group();
		gr3.setId(3);
		gr3.setName("Grname 3");
		gr3.setCreator(ac3);
		gr3.setCreateDate(LocalDate.now());
		Account[] gr3accounts = { ac2, ac3 };
		gr3.setAccounts(gr3accounts);

		System.out.println("Thông tin Group 3:");
		System.out.println("ID:" + gr3.getId());
		System.out.println("Name:" + gr3.getName());
		System.out.println("UserOfCreator:" + gr3.getCreator().getUsername());
		System.out.println("Date:" + gr3.getCreateDate());
// gán group vào account
		// cách 1
		Group[] ac1Groups = new Group[2];
		ac1Groups[0] = gr1;
		ac1Groups[1] = gr2;
		ac1.setGroups(ac1Groups);
		// cách 2
		Group[] ac2Groups = { gr1, gr2, gr3 };
		ac2.setGroups(ac2Groups);
		// cách 3
		ac3.setGroups(new Group[] { gr2, gr3 });
		// tạo instance trong TypeQuestion

		TypeQuestion tq1 = new TypeQuestion();
		tq1.setId(1);
		tq1.setName(TQname.Essay);

		System.out.println("Thông tin kiểu question 1:");
		System.out.println("ID:" + tq1.getId());
		System.out.println("TypeName:" + tq1.getName());

		TypeQuestion tq2 = new TypeQuestion();
		tq2.setId(1);
		tq2.setName(TQname.Essay);

		System.out.println("Thông tin kiểu question 2:");
		System.out.println("ID:" + tq2.getId());
		System.out.println("TypeName:" + tq2.getName());

		TypeQuestion tq3 = new TypeQuestion();
		tq3.setId(1);
		tq3.setName(TQname.Essay);

		System.out.println("Thông tin kiểu question 3:");
		System.out.println("ID:" + tq3.getId());
		System.out.println("TypeName:" + tq3.getName());

		TypeQuestion tq4 = new TypeQuestion();
		tq4.setId(1);
		tq4.setName(TQname.Essay);

		System.out.println("Thông tin kiểu question 4:");
		System.out.println("ID:" + tq4.getId());
		System.out.println("TypeName:" + tq4.getName());

		// tạo instance trong CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.setId(1);
		cq1.setName("Java");

		System.out.println("Thông tin chủ đề câu hỏi số 1:");
		System.out.println("ID:" + cq1.getId());
		System.out.println("CategoryName:" + cq1.getName());

		CategoryQuestion cq2 = new CategoryQuestion();
		cq2.setId(1);
		cq2.setName(".NET");

		System.out.println("Thông tin chủ đề câu hỏi số 2:");
		System.out.println("ID:" + cq2.getId());
		System.out.println("CategoryName:" + cq2.getName());

		CategoryQuestion cq3 = new CategoryQuestion();
		cq3.setId(1);
		cq3.setName("SQL");

		System.out.println("Thông tin chủ đề câu hỏi số 3:");
		System.out.println("ID:" + cq3.getId());
		System.out.println("CategoryName:" + cq3.getName());

		CategoryQuestion cq4 = new CategoryQuestion();
		cq4.setId(1);
		cq4.setName("Postman");

		System.out.println("Thông tin chủ đề câu hỏi số 4:");
		System.out.println("ID:" + cq4.getId());
		System.out.println("CategoryName:" + cq4.getName());

		// tạo instance trong Question
		Question qs1 = new Question();
		qs1.setId(1);
		qs1.setContent("this is content of qs1?");
		qs1.setCategoryQS(cq3);
		qs1.setTypeQS(tq4);
		qs1.setCreator(ac1);
		qs1.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Question 1:");
		System.out.println("ID:" + qs1.getId());
		System.out.println("Content:" + qs1.getContent());
		System.out.println("Category:" + qs1.getCategoryQS().getName());
		System.out.println("Type:" + qs1.getTypeQS().getName());
		System.out.println("Creator:" + qs1.getCreator().getFullName());
		System.out.println("Date:" + qs1.getCreateDate());

		Question qs2 = new Question();
		qs2.setId(2);
		qs2.setContent("this is content of qs2?");
		qs2.setCategoryQS(cq1);
		qs2.setTypeQS(tq2);
		qs2.setCreator(ac2);
		qs2.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Question 2:");
		System.out.println("ID:" + qs2.getId());
		System.out.println("Content:" + qs2.getContent());
		System.out.println("Category:" + qs2.getCategoryQS().getName());
		System.out.println("Type:" + qs2.getTypeQS().getName());
		System.out.println("Creator:" + qs2.getCreator().getFullName());
		System.out.println("Date:" + qs2.getCreateDate());

		Question qs3 = new Question();
		qs3.setId(3);
		qs3.setContent("this is content of qs3?");
		qs3.setCategoryQS(cq3);
		qs3.setTypeQS(tq4);
		qs3.setCreator(ac1);
		qs3.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Question 3:");
		System.out.println("ID:" + qs3.getId());
		System.out.println("Content:" + qs3.getContent());
		System.out.println("Category:" + qs3.getCategoryQS().getName());
		System.out.println("Type:" + qs3.getTypeQS().getName());
		System.out.println("Creator:" + qs3.getCreator().getFullName());
		System.out.println("Date:" + qs3.getCreateDate());

		Question qs4 = new Question();
		qs4.setId(1);
		qs4.setContent("this is content of qs4?");
		qs4.setCategoryQS(cq2);
		qs4.setTypeQS(tq1);
		qs4.setCreator(ac1);
		qs4.setCreateDate(LocalDate.now());

		System.out.println("Thông tin Question 4:");
		System.out.println("ID:" + qs4.getId());
		System.out.println("Content:" + qs4.getContent());
		System.out.println("Category:" + qs4.getCategoryQS().getName());
		System.out.println("Type:" + qs4.getTypeQS().getName());
		System.out.println("Creator:" + qs4.getCreator().getFullName());
		System.out.println("Date:" + qs4.getCreateDate());

		// tạo instance trong Answer
		Answer as1 = new Answer();
		as1.setId(1);
		as1.setContent("this is content of answer for qs1?");
		as1.setQuestion(qs1);
		as1.setIsCorrect(false);

		System.out.println("Thông tin Answer 1:");
		System.out.println("ID:" + as1.getId());
		System.out.println("Content:" + as1.getContent());
		System.out.println("QuestionID:" + as1.getQuestion().getId());
		System.out.println("True Or False:" + as1.getIsCorrect());

		Answer as2 = new Answer();
		as2.setId(1);
		as2.setContent("this is content of answer for qs2?");
		as2.setQuestion(qs1);
		as2.setIsCorrect(true);

		System.out.println("Thông tin Answer 2:");
		System.out.println("ID:" + as2.getId());
		System.out.println("Content:" + as2.getContent());
		System.out.println("QuestionID:" + as2.getQuestion().getId());
		System.out.println("True Or False:" + as2.getIsCorrect());

		Answer as3 = new Answer();
		as3.setId(1);
		as3.setContent("this is content of answer for qs3?");
		as3.setQuestion(qs1);
		as3.setIsCorrect(false);

		System.out.println("Thông tin Answer 3:");
		System.out.println("ID:" + as3.getId());
		System.out.println("Content:" + as3.getContent());
		System.out.println("QuestionID:" + as3.getQuestion().getId());
		System.out.println("True Or False:" + as3.getIsCorrect());

		Answer as4 = new Answer();
		as4.setId(1);
		as4.setContent("this is content of answer for qs4?");
		as4.setQuestion(qs1);
		as4.setIsCorrect(true);

		System.out.println("Thông tin Answer 4:");
		System.out.println("ID:" + as4.getId());
		System.out.println("Content:" + as4.getContent());
		System.out.println("QuestionID:" + as4.getQuestion().getId());
		System.out.println("True Or False:" + as4.getIsCorrect());

		// tạo instance trong Exam
		Exam ex1 = new Exam();
		ex1.setId(1);
		ex1.setCode(100);
		ex1.setTitle("title1");
		ex1.setCategoryExam("CategoryExam1");
		ex1.setDuration(90);
		ex1.setCreator(ac1);
		ex1.setCreateDate(LocalDate.now());
		Question[] ex1questions = { qs1, qs2 };
		ex1.setQuestions(ex1questions);

		System.out.println("Thông tin Exam 1:");
		System.out.println("ID:" + ex1.getId());
		System.out.println("Code:" + ex1.getCode());
		System.out.println("Title:" + ex1.getTitle());
		System.out.println("CategoryExam:" + ex1.getCategoryExam());
		System.out.println("Duration:" + ex1.getDuration());
		System.out.println("Creator:" + ac1.getUsername());
		System.out.println("Date:" + ex1.getCreateDate());
// Exercise 1 (Optional): Constructor
		// Question 1:
		// a)
		Department dep4 = new Department();
		// b)
		Department dep5 = new Department("Sale");
		// Question 2:
		// a)
		Account ac5 = new Account();
		// b)
		Account ac6 = new Account(2, "letuhao@gmail.com", "letuhao", "Hao", "Le");
		// c)
		Account ac7 = new Account(3, "letuhao3@gmail.com", "letuhao3", "Le3", "Hao3", po2);
		// d)
		Position pos4 = new Position();
		Account ac8 = new Account(4, "letuhao1@gmail.com", "letuhao1", "Hao1", "Le1", po1,
				LocalDate.of(2020, 12, 30));
//Exercise 4 (Optional): Constructor
		// Question 1:
		// b)
		Student st1 = new Student(1, "Lê Hảo" , "Bình Định");
		System.out.println(st1);
		// c)
		
		
		
		
	}
}
