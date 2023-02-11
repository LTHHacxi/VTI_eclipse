package com.VTI.backend;

import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.VTI.entity.Engineer;
import com.VTI.entity.Gender;
import com.VTI.entity.Staff;
import com.VTI.entity.Worker;

public class ExerciseBackend {
	private Scanner scanner = new Scanner(System.in);
	// khai báo mảng động
	private ArrayList<Staff> staffList = new ArrayList<>();

//	Phương thức thêm mới nhân viên: addStaff()
	public void addStaff() {
		System.out.println("Thêm mới cán bộ");
//		Chia ra các trường hợp
//		1. Thêm Worker
//		2. Thêm Engineer
//		3. Thêm Employee
		System.out.println("+-----Bạn muốn thêm đối tượng nào? ---------------+");
		System.out.printf("|%-49s|%n", "1. Thêm Worker");
		System.out.printf("|%-49s|%n", "2. Thêm Engineer");
		System.out.printf("|%-49s|%n", "3. Thêm Employee");
		System.out.println("+-------------------------------------------------+");
		int choose = scanner.nextInt();
		switch (choose) {
		case 1:
			System.out.println("Thêm Worker");
			System.out.println("Nhập tên Worker");
			String nameInput = scanner.next();

			System.out.println("Nhập vào tuổi Worker: ");
			int ageInput = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown: ");
			int flagWorker = scanner.nextInt();
			Gender genderInput = null;
			switch (flagWorker) {
			case 1:
				genderInput = Gender.MALE;
				break;
			case 2:
				genderInput = Gender.FEMALE;
				break;
			case 3:
				genderInput = Gender.UNKNOWN;
				break;
			}

			System.out.println("Nhập vào địa chỉ Worker: ");
			String addressInput = scanner.next();

			System.out.println("Nhập vào chuyên ngành Worker: ");
			String specializedWork = scanner.next();

			System.out.println("Nhập vào bậc Worker: ");
			int rankWorker = scanner.nextInt();

			Worker worker = new Worker();
			worker.setAddress(addressInput);
			worker.setAge(ageInput);
			worker.setGender(genderInput);
			worker.setName(nameInput);
			worker.setRank(rankWorker);
// khai báo mảng động (có thể lưu trữ nhiều đối tượng)

			Staff worker1 = new Worker(nameInput, flagWorker, genderInput, addressInput, rankWorker);
			staffList.add(worker1);

			break;
		case 2:
			System.out.println("Thêm Engineer");
			System.out.println("Nhập tên Engineer");
			String nameEngineer = scanner.next();

			System.out.println("Nhập vào tuổi Worker: ");
			int ageEngineer = scanner.nextInt();

			System.out.println("Nhập vào giới tính Worker 1.Male, 2.Female, 3.Unknown: ");
			int flagEngineer = scanner.nextInt();
			Gender genderEngineer = null;
			switch (flagEngineer) {
			case 1:
				genderEngineer = Gender.MALE;
				break;
			case 2:
				genderEngineer = Gender.FEMALE;
				break;
			case 3:
				genderEngineer = Gender.UNKNOWN;
				break;
			}

			System.out.println("Nhập vào địa chỉ Worker: ");
			String addressEngineer = scanner.next();

			System.out.println("Nhập vào chuyên ngành Worker: ");
			String specializedEngineer = scanner.next();

			Staff engineer = new Engineer(nameEngineer, ageEngineer, genderEngineer, addressEngineer,
					specializedEngineer);
			staffList.add(engineer);

// khai báo mảng động (có thể lưu trữ nhiều đối tượng)

			Staff engineer1 = new Engineer(nameEngineer, flagEngineer, genderEngineer, addressEngineer,
					specializedEngineer);
			staffList.add(engineer1);
			break;
		case 3:
			System.out.println("Thêm Employee");

			break;

		}
	}

//	Phương thức tìm kiếm theo tên nhân viên: findByName()
	public void findByName() {
		System.out.println("Tìm kiếm nhân viên");
	}

//	Phương thức hiển thị danh sách nhân viên printListStaff()
	public void printListStaff() {
		System.out.println("Hiển thị danh sách Nhân viên");
		for (Staff staff : staffList) {
			System.out.println(staff);
		}
	}

//	Phương thức xóa nhân viên deleteByName()
	public void deleteByName() {
		System.out.println("Xóa Nhân viên");
	}
}
