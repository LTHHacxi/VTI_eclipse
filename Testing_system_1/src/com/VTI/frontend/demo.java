package com.VTI.frontend;

public class demo {
	public static void main(String[] args) {
// if else
// a = 3 => gán
// a == 3 => so sánh
		int a = 1;
// condition => boolean => true or false
		System.out.println("bạn vừa nhập vào số 1");
		if (a == 1) {
			System.out.println("bạn vừa nhập vào số 1");
		} else {
			System.out.println("bạn vừa nhập vào số khác");
		}
// Toán tử tenary, 3 ngôi => tương đương if else - boolean bên trên
		System.out.println("--------------");
		System.out.println(a == 1 ? "bạn vừa nhập vào số 1" : "bạn vừa nhập vào số khác");
// 
		System.out.println("--------------");
		int b = 3;
		if (b == 1) {
			System.out.println("bạn vừa nhập vào số 1");
		} else if (b == 2) {
			System.out.println("bạn vừa nhập vào số 2");
		} else if (b == 3) {
			System.out.println("bạn vừa nhập vào số 3");
		} else {
			System.out.println("bạn vừa nhập vào một số khác");
		}
// switch case => tương tự if else
		System.out.println("------------------------");
		switch (b) {
		case 1:
			System.out.println("bạn vừa nhập vào số 1");
			break;
		case 2:
			System.out.println("bạn vừa nhập vào số 2");
			break;
		case 3:
			System.out.println("bạn vừa nhập vào số 3");
			break;
		case 4:
			System.out.println("bạn vừa nhập vào số 4");
			break;
		default:
			System.out.println("bạn vừa nhập vào một số khác");
			break;
		}
// for vòng lặp
		// thực hiện in các số từ 1 tới 3
		System.out.println("------------------------");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		// or
// i++ => i = i+1
// i-- => i = i-1
// i+=3 => i = i+3
		for (int i = 1; i <= 3; i = i + 1) {
			System.out.println(i);
		}
// úng dụng for
		System.out.println("------------------------");
		String[] namerailway63 = { "phương", "Vi", "Long", "Nam", "Tu" };
//System.out.println(namerailway63[0]);
//System.out.println(namerailway63[1]);
//System.out.println(namerailway63[2]);
//System.out.println(namerailway63[3]);
//System.out.println(namerailway63[4]);
		for (int i = 0; i <= namerailway63.length - 1; i++) {
//or for (int i = 0; i < namerailway63.length; i++) 
			System.out.println(namerailway63[i]);
		}

//for each
		System.out.println("-----------for each-------------");
		for (String name : namerailway63) {
			System.out.println(name);
		}

//while
		// in ra các số từ 1 tới 10
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;

		}
		//while true
		System.out.println("-----------while true---------------");
//		while (true) {
//			System.out.println("DaoNQ");
//		}
		//do while
		System.out.println("-----------do while ---------------");
		int t =1;
		do {
			System.out.println(t);
			t++;
		} while (t <= 10);
// break
		for (int j = 0; j < 10; j++) {
			if (j == 3) {
				break;
			}
			System.out.println(j);
		}
// continue
		for (int j = 0; j < 10; j++) {
			if (j == 3) {
				continue;
			}
			System.out.println(j);
		}
		
		
		
		
		
	}
}
