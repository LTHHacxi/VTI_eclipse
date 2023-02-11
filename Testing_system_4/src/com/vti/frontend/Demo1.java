package com.vti.frontend;

import com.vti.entity.Department;

public class Demo1 {
	public static void main(String[] args) {
		Department dep1 = new Department();
		System.out.println("Thông tin phòng ban 1 là: id: " + dep1.id + ",name: " + dep1.name);
// hoặc dep1.toPrintDepartment();

		Department dep2 = new Department(2, "Marketing");
		dep2.toPrintDepartment();

		Department dep3 = new Department(3, "Sale");
		System.out.println("Thông tin phòng ban 3 là: " + dep3.toPrintDepartment2());
		;

	}
}
