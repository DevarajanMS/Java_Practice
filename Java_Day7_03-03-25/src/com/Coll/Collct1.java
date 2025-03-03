package com.Coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collct1 {
	public static void main(String[] args) {
		
		// Collection data =  new ArrayList();
		// List data = new ArrayList();
		
		ArrayList data = new ArrayList();
		
		data.add(10);
		data.add("java");
		data.add(33.44f);
		data.add(false);
		
		System.out.println(data);
		
		data.set(2, "changed");
		
		System.out.println(data);
		
		data.remove(2);
		
		System.out.println(data);
		
		System.out.println(data.get(2));
		
		System.out.println(data.contains("java"));
		
		System.out.println(data.getFirst()+ " "+data.getLast());
		
		System.out.println("Iterating using Iterator: ");

		//for(Object o: data) {
		//	System.out.print(o);
		//	System.out.print(o.getClass());
		//}
		
		Iterator itr = data.iterator();
		
		ListIterator ltr = data.listIterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		while(ltr.hasPrevious()) {
			System.out.print(ltr.previous()+" ");
		}
	}
}
