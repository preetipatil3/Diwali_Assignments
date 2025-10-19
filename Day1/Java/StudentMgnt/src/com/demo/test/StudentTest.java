package com.demo.test;

import com.demo.service.LowAttendanceException;
import com.demo.service.Student;

public class StudentTest {

	public static void main(String[] args) {
		try {
		Student stu=new Student(1,"prasad","AiMl",80,60);
		System.out.println(stu);
		String grade=stu.calculateGrade();
		System.out.println(grade);
		
		System.out.println();
		
		Student stu1=new Student(2,"Pratik","Mech",70,90);
		System.out.println(stu1);
		
		}catch(LowAttendanceException e) {
			System.out.println("Error:"+e.getMessage());
		}

	}

}
