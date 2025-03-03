package com.Coll;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer //implements Comparable<Customer>
{
	
	private int id;
	private String name;
	private String city;
	
	public Customer() {
		
	}
	
	public Customer(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	//@Override
	/*public int compareTo(Customer o) {
		return this.id-o.id;
	}*/
	
}


public class SortPract {
	public static void main(String[] args) {
		
		List<Customer> cust = new ArrayList<>();
		
		cust.add(new Customer(4,"Hari","Chennai"));
		cust.add(new Customer(23,"Vicky","Nellore"));
		cust.add(new Customer(16,"Jaga","Mangalore"));
		cust.add(new Customer(2,"Nithesh","Jammu"));
		cust.add(new Customer(18,"Raja","Hyderabad"));
		cust.add(new Customer(5,"Pandya","Sikkim"));
		//cust.add(new Customer(4,"Hari","Chennai"));
		//cust.add(new Customer(4,"Hari","Chennai"));
		
		//Collections.sort(cust);
		
		cust.forEach(cst -> System.out.println("ID :"+cst.getId()+", Name :"+cst.getName()+", City :"+cst.getCity()));

		// Using Stream API to print names with filtering starting with characters
		
		/* cust.stream()
		.filter(cst -> cst.getName().startsWith("V"))
		.forEach(dt -> System.out.println(dt));
		*/
		// Using Stream API sorting customer data
		
		cust.stream()
		.sorted(Comparator.comparing(Customer :: getName))
		.forEach(cst -> System.out.println("ID :"+cst.getId()+", Name :"+cst.getName()+", City :"+cst.getCity()));
		
		// create new List and store the formated data
		
		List<Customer> frmtData = cust.stream()
				.sorted(Comparator.comparing(Customer :: getName))
				.collect(Collectors.toList());
		
		for(Customer ct : frmtData) {
			System.out.println(ct);
		}
		
		frmtData.forEach(cst -> System.out.println("ID :"+cst.getId()+", Name :"+cst.getName()+", City :"+cst.getCity()));

	}
}
