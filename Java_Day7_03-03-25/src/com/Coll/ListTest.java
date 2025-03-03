package com.Coll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// create Employee class with basic data
// iterate using Stream API and print starts with " " filter and who joined after 2020 in a sorted manner;
// create new list and store the data

class Employees{
	
	private int id, age;
	
	private String gender, name;
	
	private int yoj;
	
	private int salary;
	
	public Employees() {
		
	}

	public Employees(int id, int age, String gender, String name, int yoj, int salary) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.yoj = yoj;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYoj() {
		return yoj;
	}

	public void setYoj(int yoj) {
		this.yoj = yoj;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", age=" + age + ", gender=" + gender + ", name=" + name + ", yoj=" + yoj
				+ ", salary=" + salary + "]";
	}	
	
}

public class ListTest {
	
	public static void main(String[] args) {
		
		List<Employees> empList = new ArrayList<>();
		//Employees emp = new Employees();
		
		//System.out.println(emp);
		
		empList.add(new Employees(12,24,"Male","Hari",2020,150000));
		empList.add(new Employees(21,30,"Female","Abinaya",2023,100000));
		empList.add(new Employees(34,25,"Male","Ramesh",2024,50000));
		empList.add(new Employees(15,21,"Male","George",2019,40000));
		empList.add(new Employees(10,23,"Male","Mohith",2021,60000));
		empList.add(new Employees(7,24,"Female","Monisha",2025,300000));
		empList.add(new Employees(34,25,"Male","Ramesh",2024,50000));
		empList.add(new Employees(10,23,"Male","Mohith",2021,60000));

		
		
		// Printing only names starts with "Mo" and Yoj is after 2020 using stream API
		List<Employees> fltr = empList.stream().distinct().sorted(Comparator.comparing(Employees :: getSalary)).filter(emp -> (emp.getYoj()>=2020 && emp.getName().startsWith("Mo"))).collect(Collectors.toList());
		
		List<String> fltr1 = empList.stream()
				.filter(emp -> emp.getName().startsWith("Mo")).map(emp -> emp.getName()).toList();
		
		fltr1 = fltr1.stream().distinct().toList();
		
		int count1 = fltr.size();
		int count2 = fltr1.size();
		
		System.out.println("Count of unique objects: "+count1);
		
		fltr.forEach(emp -> System.out.println("Id: "+emp.getId()+", Age: "+emp.getAge()+", Gender: "+emp.getGender()+", Name: "+emp.getName()+", Yoj: "+emp.getYoj()+", Salary: "+emp.getSalary()));
		
		System.out.println("Count of unique names: "+count2);
		
		for(String str : fltr1) {
			System.out.print(str+" ");
		}
	}
	

}
