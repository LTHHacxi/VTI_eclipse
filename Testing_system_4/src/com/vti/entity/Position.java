package com.vti.entity;
import com.vti.entity.Position.Pname;
public class Position {
	private int id;
	
	// có thể tạo enum từ tạo enum file trong mục entity
		public enum Pname {
			Dev, Test, Scrum_Master, PM
		}

		private Pname name;
// Exercise 3: Access Modifier
	// Question 1:

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Pname getName() {
			return name;
		}

		public void setName(Pname name) {
			this.name = name;
		}
		
}
