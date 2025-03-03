package com.Coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>{
	private int id;
	
	private String name;
	
	private int age;
	
	public Student(){
		
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
	
}

public class SortStreamAPIorLambda {
	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student(4,"Hari",23));
		stdList.add(new Student(6,"Raja",20));
		stdList.add(new Student(10,"Jeeva",17));
		stdList.add(new Student(7,"Santhanam",25));
		stdList.add(new Student(1,"Vivek",21));
		stdList.add(new Student(8,"Dharmadhurai",20));
		
		// sorting Student list using Stream API

		// (Student :: getId) -> Student std = new Student; std.getId();
		
		System.out.println("Before Sorting Student Data: ");
		
		stdList.forEach(std -> System.out.println("ID :"+std.getId()+", Name :"+std.getName()+", Salary :"+std.getAge()));
		
		List<Student> frmtData = 
				stdList.stream()
				.sorted(Comparator.comparing(Student :: getName).reversed().thenComparing(Student :: getId)).collect(Collectors.toList());
		
		System.out.println("After Sorting Student Data: ");
		
		frmtData.forEach(std -> System.out.println("ID :"+std.getId()+", Name :"+std.getName()+", Salary :"+std.getAge()));
	}
}
