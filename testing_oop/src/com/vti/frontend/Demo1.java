package com.vti.frontend;

import com.vti.entity.Account;

public class Demo1 {
	public static void main(String[] args) {
		Account account1 = new Account();
//		account1.id = 1;
//		account1.email = "DAONQ@gmail.com";
//		account1.username = "DAONQ";
//		account1.fullname = "Nguyễn Đạo";

		account1.setId(1);
		account1.setEmail("DAONQ@gmail.com");
		account1.setUsername("DAONQ");
		account1.setFullname("Nguyễn Đạo");

		System.out.println("Thông tin Account 1:");
		System.out.println("ID:" + account1.getId());
		System.out.println("Email:" + account1.getEmail());
		System.out.println("Username:" + account1.getUsername());
		System.out.println("Fullname:" + account1.getFullname());

	}
}