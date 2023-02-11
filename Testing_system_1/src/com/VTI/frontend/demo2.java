package com.VTI.frontend;

import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		// Chương trình cộng 2 số:
//		sum();
//		// Chương trình trừ 2 số:
//		minus();
// java scaner: lấy dữ liệu nhập từ bàn phím	
		// phép cộng
//		System.out.println("--------phép cộng----------");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào số thứ 1: ");
//		int a = scanner.nextInt();
//
//		System.out.println("Mời bạn nhập vào số thứ 2: ");
//		int b = scanner.nextInt();
//
//		int result = a + b;
//		System.out.println("Tổng 2 số là: " + result);
//		// phép trừ
//		System.out.println("--------phép trừ----------");
//		Scanner scanner2 = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào số thứ 1: ");
//		int c = scanner2.nextInt();
//
//		System.out.println("Mời bạn nhập vào số thứ 2: ");
//		int d = scanner2.nextInt();
//
//		int resultMinus = c + d;
//		System.out.println("Hiệu 2 số là: " + resultMinus);
		// làm chương trình lặp lại
		while (true) {
			System.out.println("+-----------------MENU---------------+");
			// dấu - để căng dòng
			// 49 là số kí tự tối thiểu trong cả dòng này
			// %n để xuống dòng
			System.out.printf("|%-36s|%n", "Mời bạn chọn phép tính: ");
			System.out.printf("|%-36s|%n", "1. Tổng");
			System.out.printf("|%-36s|%n", "2. Hiệu");
			System.out.printf("|%-36s|%n", "3. Tích");
			System.out.printf("|%-36s|%n", "4. Phân");
			System.out.println("+------------------------------------+");
			int choseMenu = scanner.nextInt();
			switch (choseMenu) {
			case 1:
				sum();
				break;
			case 2:
				minus();
				break;

			default:
				System.out.println("Mời bạn chọn lại");
				break;
			}

		}

// show tên
//		System.out.println("------------------");
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("Mời bạn nhập vào tên: ");
//		String name = scanner1.nextLine();
//		System.out.println("Tên bạn là: " + name);
// hãy thực hiện thao tác ng dùng nhập id, và tên ng dùng từ phòng ban mới
//		Scanner dpscanner = new Scanner(System.in);
//
//		System.out.println("Tạo mới phòng ban");
//		System.out.println("Mời bạn nhập vào id phòng ban: ");
//		int iddep = dpscanner.nextInt();
//
//		System.out.println("Mời bạn nhập vào tên phòng ban: ");
//		String namedep = dpscanner.nextLine();
//
//		Department dpnew = new Department();
//		dpnew.id = iddep;
//		dpnew.name = namedep;

		// cách khác để nhập
//		System.out.println("Mời bạn nhập vào số thứ 1: ");
//		int a = scanner1.nextInt();
//
//		System.out.println("Mời bạn nhập vào số thứ 2: ");
//		int b = scanner1.nextInt();
//		
//		System.out.println("Tổng 2 số là: " + sum_ab(a,b));
	}

	// viết hàm sum() (phải khai báo khúc dưới, ra ngoài hàm main)
	public static void sum() {
		System.out.println("--------phép cộng----------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thứ 1: ");
		int a = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số thứ 2: ");
		int b = scanner.nextInt();

		int result = a + b;
		System.out.println("Tổng 2 số là: " + result);
	}

// viết hàm minus() (phải khai báo khúc dưới, ra ngoài hàm main)
	public static void minus() {
		System.out.println("--------phép trừ----------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Mời bạn nhập vào số thứ 1: ");
		int c = scanner.nextInt();

		System.out.println("Mời bạn nhập vào số thứ 2: ");
		int d = scanner.nextInt();

		int resultMinus = c + d;
		System.out.println("Hiệu 2 số là: " + resultMinus);
	}

	public static int sum_ab(int a, int b) {
		int result_sum = a + b;
		return result_sum;
	}
}
