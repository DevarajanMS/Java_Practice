package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;


public class ExMap {
	
	public static void main(String[] args) {
		
		//Map data = new HashMap();
		
		LinkedHashMap data = new LinkedHashMap();
	
		data.put("java", "java");
		data.put(101, "java");
		data.put(33, 33);
		data.put(99, "java");
		data.put(99,'a');
		data.put(101,"king");
		
		//System.out.println(data);

		
		Iterator<Entry> itr = data.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry et = itr.next();
			
			System.out.println(et.getKey()+"="+et.getValue());
		}
		
		System.out.println(data);
	}

}
