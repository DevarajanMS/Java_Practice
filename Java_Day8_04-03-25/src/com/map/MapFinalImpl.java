package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee1{
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String department;
	
	private int yearOfJoining;
	
	double salary;
	
	public Employee1() {
		
	}

	public Employee1(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
	
}

public class MapFinalImpl {
	
	// 1 - find count of male and female employees present in the company
	
	public static void getCountOfMaleAndFemale(List<Employee1> empList) {
		
		Map<String, Long> mpresult = empList.stream().collect(Collectors.groupingBy(Employee1 :: getGender, Collectors.counting()));
		
		System.out.println(mpresult);
	}
	
	// 2 - Write the program to print the name of all departments in the company
	
	public static void getDepartmentNames(List<Employee1> empList) {
		
		empList.stream()
			   .map(Employee1 :: getDepartment)
			   .distinct()
			   .forEach(System.out :: println);
	}
	
	// 3 - Find the Average age of Male and Female;
	
	public static void getAverageGenderAge(List<Employee1> empList) {
		
		Map<String, Double> avgData = 
				empList.stream().
				collect(Collectors.groupingBy(Employee1 :: getGender,
						  Collectors.averagingInt(Employee1 :: getAge)));
		System.out.println(avgData);
	}
	
	// 4 - Get the name of Employees who joined after 2019
	
	public static void getNameOfEmployees(List<Employee1> empList) {
		
		empList.stream().filter(emp -> emp.getYearOfJoining() > 2019)
						.map(Employee1 :: getName)
						.forEach(System.out :: println);
	}
	
	// 5 - Count the number of employees from each department
	
	public static void countByDept(List<Employee1> empList) {
		
		Map<String, Long> mpresult = empList.stream().collect(Collectors.groupingBy(Employee1 :: getDepartment, Collectors.counting()));
		
		System.out.println(mpresult);
	}
	
	// 6 - Find out the Average Salary of Each  Department
	
	public static void avrgSalaryOfDept(List<Employee1> empList) {
		
		Map<String, Double> avgSalary = 
				empList.stream().
				collect(Collectors.groupingBy(Employee1 :: getDepartment,
						  Collectors.averagingDouble(Employee1 :: getSalary)));
		System.out.println(avgSalary);
		
	}
	
	// 7 - Find out the oldest employee, his/her age and Department
	
	public static void oldestEmployeeAgeNDpt(List<Employee1> empList) {
		
		Optional<Employee1> oldEmp = 	
				empList.stream()
				.max(Comparator.comparing(Employee1 :: getAge));
		
		Employee1 empData = oldEmp.get();
		
		System.out.println("Name :"+empData.getName());
		System.out.println("Age :"+empData.getAge());
		System.out.println("Department :"+empData.getDepartment());
		
	}
	
	// 8 - Find out the average and total salary of the company
	
	public static void avgNTotalSalary(List<Employee1> empList) {
		
		DoubleSummaryStatistics empSalResult = 
				empList.stream()
				.collect(Collectors.summarizingDouble(Employee1 :: getSalary));
		
		System.out.println("Average salary: "+empSalResult.getAverage());
		System.out.println("Total Salary: "+empSalResult.getSum());
		
	}
	
	// 9 - List down the employees from each department
	
	public static void listEmpFromEachDpt(List<Employee1> empList) {
		
		Map<String, List<Employee1>> empListDpt = 
				
				empList.stream()
				.collect(Collectors.groupingBy(Employee1 :: getDepartment));
	
		for(String k : empListDpt.keySet()) {
			
			System.out.println("Departments :: "+k);
			
			List<Employee1> emp = empListDpt.get(k);
			
			for(Employee1 dt : emp) {
				System.out.println(dt);
			}
		}
	}
	
	// 10 - Find the employee with the highest Experience in the company
	
	public static void getSeniorEmployee(List<Employee1> empList) {
		
		Optional<Employee1> seniorEmp =
				
				empList.stream()
				.sorted(Comparator.comparing(Employee1 :: getYearOfJoining))
				.findFirst();
		Employee1 empData = seniorEmp.get();
		
		System.out.println("Senior Employee from the company : ");
		System.out.println("==================================");
		System.out.println("ID : "+empData.getId());
		System.out.println("Name : "+empData.getName());
		System.out.println("Age : "+empData.getAge());
	
	}
	
	public static void main(String[] args) {
		
		List<Employee1> empData = new ArrayList<>();
		
		empData.add(new Employee1(23,"Deva",21,"Male","Software Developer",2020,40000.0));
		empData.add(new Employee1(12,"Adhavan",23,"Male","HR",2019,35000.0));
		empData.add(new Employee1(35,"Harini",25,"Female","Infrastructure",2023,54000.0));
		empData.add(new Employee1(10,"Ragavi",27,"Female","HR",2020,30000.0));
		empData.add(new Employee1(45,"Suresh",30,"Male","Sales and Marketing",2018,25000.0));
		empData.add(new Employee1(7,"Mahendran",22,"Male","Product Development",2017,45000.0));
		empData.add(new Employee1(18,"Sandhiya",28,"Female","Accounts and Finance",2015,55000.0));
		empData.add(new Employee1(25,"Ragavan",24,"Male","Security and Transport",2021,30000.0));
		empData.add(new Employee1(13,"Ranjitha",32,"Female","HR",2020,33000.));
		empData.add(new Employee1(3,"Nithesh",45,"Male","Software Developer",2013,75000.0));
		empData.add(new Employee1(58,"Keerthana",37,"Female","Infrastructure",2018,50000.0));
		
		// long count=empData.stream().filter(emp -> emp.getGender().equals("Male")).count();
		
		// System.out.println(count);
		
		// MapFinalImpl.getCountOfMaleAndFemale(empData);
		
		// MapFinalImpl.getDepartmentNames(empData);
		
		// MapFinalImpl.getAverageGenderAge(empData);
		
		// MapFinalImpl.getNameOfEmployees(empData);
		
		// MapFinalImpl.countByDept(empData);
		
		// MapFinalImpl.avrgSalaryOfDept(empData);
		
		// MapFinalImpl.oldestEmployeeAgeNDpt(empData);
		
		// MapFinalImpl.avgNTotalSalary(empData);
		
		// MapFinalImpl.listEmpFromEachDpt(empData);
		
		MapFinalImpl.getSeniorEmployee(empData);
	}

}
