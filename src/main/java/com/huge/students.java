package com.huge;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class students{
	
		@Id
		private int Id;
		private int Age;
		private String students_name;
		private String Gender;
		
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			this.Id = Id;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int Age) {
			this.Age = Age;
		}
		public String getstudents_name() {
			return students_name;
		}
		public void setstudents_name(String students_name) {
			this.students_name = students_name;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String Gender) {
			this.Gender = Gender;
		}
		@Override
		public String toString() {
			return "Alien [Id=" + Id + ", Age=" + Age + ",name=" + students_name + ", Gender=" + Gender + "]";
		}

		
	}


