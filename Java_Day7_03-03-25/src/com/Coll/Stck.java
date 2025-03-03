package com.Coll;

import java.util.Enumeration;
import java.util.Stack;

public class Stck {
	public static void main(String[] args) {
		
		Stack data =  new Stack();
		
		data.add(10);
		data.add("java");
		data.add(33.44f);
		data.add(false);
		
		System.out.println(data);
		
		System.out.println(data.peek());
		
		System.out.println(data.push("king"));
		
		System.out.println(data);
		
		System.out.println(data.pop());
		
		System.out.println(data.peek());

		System.out.println(data.search("java"));

		System.out.println(data.empty());		
		
		//data.clear();	
		
		System.out.println(data.empty());		

		Enumeration itr = data.elements();
		
		while(itr.hasMoreElements()) {
			System.out.print(itr.nextElement()+" ");
		}

	}
}
