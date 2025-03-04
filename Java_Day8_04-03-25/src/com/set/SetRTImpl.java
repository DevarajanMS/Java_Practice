package com.set;

//import java.util.HashSet;
import java.util.TreeSet;
import java.util.Objects;
import java.util.Comparator;


class Book implements Comparable<Book>{
	
	private int id;
	
	private String name;
	
	private String author;
	
	private int price;
	
	public Book() {
		
	}
	
	public Book(int id, String name, String author, int price) {
		
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	@Override
	public int compareTo(Book bk) {
		return this.id-bk.id;
	}
}

class NameComparator1 implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
}

public class SetRTImpl {
	
	public static void main(String[] args) {
		
		TreeSet<Book> data = new TreeSet<>(new NameComparator1());
		
		data.add(new Book(12,"Basics of Java","Deva",300));
		data.add(new Book(2,"SpringBoot","Hari",500));
		data.add(new Book(12,"Basics of Java","Deva",300));
		data.add(new Book(32,"Python","Fahim",350));
		data.add(new Book(23,"C Programming","Nagaraj",250));
		data.add(new Book(45,"Ruby","Karran",400));
		data.add(new Book(7,"Linux Basics","Prema",750));
			
		//System.out.println(data);
		
		System.out.println("Using Lambda Iterator: ");
		
		data.forEach(dt -> System.out.println(dt+" "));
		
		// Using steam API 
		
		System.out.println("Using Stream API: ");
		
		data.parallelStream().filter(bk -> bk.getPrice()>=350).forEach(dt -> System.out.println(dt));
	
		
	}

}
