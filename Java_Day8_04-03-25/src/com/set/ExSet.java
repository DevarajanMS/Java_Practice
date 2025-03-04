package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExSet {

		public static void main(String[] args) {
			
			// Collection data = new HashSet();
			// Set data = new HashSet();
			
			LinkedHashSet data = new LinkedHashSet();
			
			data.add("java");
			data.add(212);
			data.add(false);
			data.add(138.4f);
			data.add(34.56);
			data.add(212);
			data.add("java");
			
			Iterator itr = data.iterator();
			
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
			
			System.out.println();
			
			System.out.println(data);
			
			System.out.println("Lambda Iterator: ");
			 
			data.forEach(dt -> System.out.println(dt));
		}
}
