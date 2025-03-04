package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Books{
	
	private int id;
	
	private String name;
	
	private String author;
	
	public Books() {
		
	}

	public Books(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name);
	}
	
}

public class MapRTImplAd {
	
	public static void main(String[] args) {
		
		Map<String, List<Books>> bookData = new HashMap<>();
		
		List<Books> bdata1 = new ArrayList<>();
		
		bdata1.add(new Books(12,"Advanced Java","Aakash"));
		bdata1.add(new Books(13,"Core Java","Devarajan"));
		bdata1.add(new Books(14,"Python Basics","Praveen"));

		List<Books> bdata2 = new ArrayList<>();

		bdata2.add(new Books(15,"Embedded C","Karthick"));
		bdata2.add(new Books(16,"Basics of Linux","Gourav"));
		
		List<Books> bdata3 = new ArrayList<>();
		
		bdata3.add(new Books(17,"Spring","Bharath"));
		bdata3.add(new Books(18,"React","Raja"));
		bdata3.add(new Books(19,"Operating Systems","Jana"));
		
		bookData.put("Software", bdata1);
		bookData.put("Electronics", bdata2);
		bookData.put("Frameworks", bdata3);
		
		Iterator<Entry<String, List<Books>>> itr = bookData.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, List<Books>> et = itr.next();
			
			System.out.println("Department : "+et.getKey());
			
			for(Books bd : et.getValue()) {
				System.out.println(bd.getId()+" -> "+bd.getName()+" -> "+bd.getAuthor()+" -> ");
			}
			
		}
		
		bookData.forEach((k,v) -> System.out.println(k+" "+v));
	}

}
