package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position.Pname;

public class Exercise_1 {

	public void question_1(Account ac2) {
		System.out.println("--------------Exercise 1 - Question 1--------------");
		if (ac2.getDepartment() == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là " + ac2.getDepartment().getName());
		}

	}

	public void question_2(Account ac2) {
		System.out.println("--------------Exercise 1 - Question 2--------------");
		if (ac2.getGroups().length == 0) {
			System.out.println("Nhân viên này chưa cố group");
		} else if (ac2.getGroups().length == 1) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (ac2.getGroups().length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (ac2.getGroups().length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}
	}

	public void question_3(Account ac2) {
		System.out.println("--------------Exercise 1 - Question 3--------------");
		System.out.println(ac2.getDepartment() == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là " + ac2.getDepartment().getName());
	}

	public void question_4(Account ac1) {
		System.out.println("--------------Exercise 1 - Question 4--------------");
		System.out.println(ac1.getPosition().getName() == Pname.Dev ? "Đây là Developer" : "Người này không phải là Developer");
	}

	public void question_5(Group gr1) {
		System.out.println("--------------Exercise 1 - Question 5--------------");
		if (gr1.getAccounts() == null) {
			System.out.println("Nhóm chưa có thành viên");
		} else {

			switch (gr1.getAccounts().length) {
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
	}

	public void question_6(Account ac2) {
		System.out.println("--------------Exercise 1 - Question 6--------------");
		switch (ac2.getGroups().length) {
		case 0:
			System.out.println("Nhân viên này chưa cố group");
			break;
		case 1:
			System.out.println("Group của nhân viên này là :" + ac2.getGroups()[0].getName());
			break;
		case 2:
			System.out.println("Group của nhân viên này là  :" + ac2.getGroups()[0].getName() + ac2.getGroups()[1].getName());
			break;
		case 3:
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
		default:
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
		}
	}

	public void question_7(Account ac1) {
		System.out.println("--------------Exercise 1 - Question 7--------------");
		switch (ac1.getPosition().getName().toString()) {
		case "Dev":
			System.out.println("Đây là Developer");
			break;
		default:
			System.out.println("Người này không phải là Developer");
			break;
		}
	}

	public void question_8(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 8--------------");
//		Account[] accArray = { ac1, ac2, ac3 };
		for (Account account : accArray) {
			System.out.println("AccountID: " + account.getId() + " Email: " + account.getEmail() + " Name: " + account.getFullName());
		}
	}

	public void question_9(Department[] depArray) {
		System.out.println("--------------Exercise 1 - Question 9--------------");
		// Department[] depArray = { dep1, dep2, dep3 };
		for (Department department : depArray) {
			System.out.println("AccountID: " + department.getId() + " Name: " + department.getName());
		}
	}

	public void question_10(Account[] accArray2) {
		System.out.println("--------------Exercise 1 - Question 10--------------");
		for (Account account : accArray2) {
			System.out.println("Thông tin account là: ");
			System.out.println("Email: " + account.getEmail());
			System.out.println("Full name: " + account.getFullName());
			System.out.println("Phòng ban: " + account.getDepartment().getName());
		}
	}

	public void question_11(Department[] depArray2) {
		System.out.println("--------------Exercise 1 - Question 11--------------");
//		Department[] depArray2 = { dep1, dep2 };
		for (int i = 0; i < depArray2.length; i = i + 1) {
			System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
			System.out.println("Id: " + depArray2[i].getId());
			System.out.println("Name: " + depArray2[i].getName());
		}
	}

	public void question_12(Department[] depArray3) {
		System.out.println("--------------Exercise 1 - Question 12--------------");
//		Department[] depArray3 = { dep1, dep2, dep3 };
		for (int i = 0; i < 2; i = i + 1) {
			System.out.println("Thông tin Department thứ " + (i + 1) + " là: ");
			System.out.println("Email: " + depArray3[i].getId());
			System.out.println("Full name: " + depArray3[i].getName());
		}
	}

	public void question_13(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 13--------------");
//		Account[] accArray4 = { ac1, ac2, ac3, ac4 };
		for (int i = 0; i < accArray.length; i = i + 1) {
			if (i != 1) {
				System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
				System.out.println("Email: " + accArray[i].getEmail());
				System.out.println("Full name: " + accArray[i].getFullName());
				System.out.println("Phòng ban: " + accArray[i].getDepartment().getName());
			}
		}
	}

	public void question_14(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 14--------------");
		for (int i1 = 0; i1 < accArray.length; i1++) {
			if (accArray[i1].getId() < 4) {
				System.out.println("Thông tin account: ");
				System.out.println("Id: " + accArray[i1].getId());
				System.out.println("Name: " + accArray[i1].getEmail());
				System.out.println("Name: " + accArray[i1].getFullName());
				System.out.println("Name: " + accArray[i1].getUsername());
			}
		}
	}

	public void question_15(int i) {
		System.out.println("--------------Exercise 1 - Question 15--------------");
		for (i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
	}

	public void question_16(Department[] depArray3) {
		System.out.println("--------------Exercise 1 - Question 16--------------");
//		Department[] depArray4 = { dep1, dep3 };
		int i1 = 0;
		while (i1 < depArray3.length) {
			System.out.println("Thông tin department thứ" + (i1 + 1) + "là: ");
			System.out.println("Id: " + depArray3[i1].getId());
			System.out.println("Name: " + depArray3[i1].getName());
			i1 = i1 + 1;
		}
	}

	public void question_17_10(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 17-10--------------");
//		Account[] accArray = { ac1, ac2, ac3, ac4 };
		int i = 0;
		do {
			System.out.println("Thông tin account thứ" + (i + 1) + "là: ");
			System.out.println("Email: " + accArray[i].getEmail());
			System.out.println("Full name: " + accArray[i].getFullName());
			System.out.println("Phòng ban: " + accArray[i].getDepartment().getName());
			i++;
		} while (i < accArray.length);
	}

	public void question_17_11(Department[] depArray) {
		System.out.println("--------------Exercise 1 - Question 17-11--------------");
//		Department[] depArray = { dep1, dep2, dep3 };
		int i11 = 0;
		do {
			System.out.println("Thông tin department thứ " + (i11 + 1) + " là: ");
			System.out.println("Id: " + depArray[i11].getId());
			System.out.println("Name: " + depArray[i11].getName());
			i11++;
		} while (i11 < depArray.length);
	}

	public void question_17_12(Department[] depArray) {
		System.out.println("--------------Exercise 1 - Question 17-12--------------");
//		Department[] depArray = { dep1, dep2, dep3 };
		int e = 0;
		do {
			System.out.println("Thông tin Department thứ " + (e + 1) + " là: ");
			System.out.println("Email: " + depArray[e].getId());
			System.out.println("Full name: " + depArray[e].getName());
			e++;

		} while (e < 2);
	}

	public void question_17_13(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 17-13--------------");
//		Account[] accArray = { ac1, ac2, ac3, ac4 };
		int q = 0;
		do {
			if (q != 1) {
				System.out.println("Thông tin account thứ " + (q + 1) + " là: ");
				System.out.println("Email: " + accArray[q].getEmail());
				System.out.println("Full name: " + accArray[q].getFullName());
				System.out.println("Phòng ban: " + accArray[q].getDepartment().getName());
			}
			q++;
		} while (q < accArray.length);
	}

	public void question_17_14(Account[] accArray) {
		System.out.println("--------------Exercise 1 - Question 17-14--------------");
		int r = 0;
//		Account[] accArray = { ac1, ac2, ac3, ac4 };
		do {
			if (accArray[r].getId() < 4) {
				System.out.println("Thông tin account: ");
				System.out.println("Id: " + accArray[r].getId());
				System.out.println("Name: " + accArray[r].getEmail());
				System.out.println("Name: " + accArray[r].getFullName());
				System.out.println("Name: " + accArray[r].getUsername());
			}
			r++;

		} while (r < accArray.length);
	}

	public void question_17_15(int y) {
		System.out.println("--------------Exercise 1 - Question 17-15--------------");
		y = 0;
		do {
			if (y % 2 == 0) {
				System.out.print(y);
			}
			y++;
		} while (y <= 20);
	}

}
