package com.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ExTreeMap {
	public static void main(String[] args) {
		
		TreeMap<String, Integer> data = new TreeMap<>();
		
		data.put("dell", 200);
		data.put("mac", 450);
		data.put("hp",300);
		data.put("asus",400);
		data.put("lenovo",200);
		data.put("asus", 230);
		
		System.out.println(data);
		
		Iterator<Entry<String, Integer>> itr = data.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, Integer> dt = itr.next();
			System.out.println("Product: "+dt.getKey()+" --> Price: "+dt.getValue());
		}
		
		for(String k : data.keySet()) {
			System.out.println(k+" --> "+data.get(k));
		}
		
		System.out.println("Using Java8 Lamdba feature for iterating: ");
		
		
	}
}
