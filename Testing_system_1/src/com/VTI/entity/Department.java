package com.VTI.entity;

public class Department {
	public int id;
	public String name;

// viết ra phương thức in thông tin các phòng ban
// sau khi viết xong qua bên program gõ dep1.DepartmentInfo(); là nó tự in
	public void DepartmentInfo() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
	}
}
// BT tạo 1 chương trình mới khi chạy thì nó hỏi mời bạn chọn question, khi chọn xong nó sẽ hiện lời giải
// question bỏ hết vào backend