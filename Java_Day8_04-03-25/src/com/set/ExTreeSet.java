package com.set;

import java.util.TreeSet;
import java.util.Iterator;

public class ExTreeSet {
	
	public static void main(String[] args) {
		
		// Collection ts = new TreeSet();
		// Set ts = new TreeSet();
		
		TreeSet<String> data = new TreeSet<>();
		
		data.add("Harbajan");
		data.add("Zaheer");
		data.add("Dhoni");
		data.add("rohith");
		data.add("pandya");
		data.add("hardik");
		data.add("java");
		
		System.out.println(data);
		
		// Iterator<String> itr = data.iterator();
		
		System.out.println(data.reversed());
		
		System.out.println("Using Lambda Iterator: ");
		
		data.forEach(dt -> System.out.print(dt+" "));
		
		System.out.println();
			
		// Printing Subset
		
		System.out.println(data.subSet("hardik", "pandya"));
		
	}

}
