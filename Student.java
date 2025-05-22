package com.thiskeyword;

public class Student {

	int rollNo;
	String name;
	
	public Student(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void updateDetails(String name) {
		this.name=name;
	}
	
	public void display() {
		System.out.println("Student RollNo: "+rollNo+"\nStudent Name: "+name);
	}
	
	public static void main(String[] args) {
		System.out.println("Student Old Name: ");
		Student std=new Student(1,"Chandana");
		std.display();
		System.out.println("--------------");
		System.out.println("Student New Name: ");
		std.updateDetails("Leela");
		std.display();
	}

}
