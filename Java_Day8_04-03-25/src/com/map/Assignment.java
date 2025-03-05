package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Orders{
	
	private int id;
	private String name;
	private double price;
	private int year;
	private String month;
	private String city;
	private String category;
	private int quantity;
	
	public Orders() {
		
	}

	public Orders(int id, String name, double price, int year, String month, String city, String category, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.year = year;
		this.month = month;
		this.city = city;
		this.category = category;
		this.quantity = quantity;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", name=" + name + ", price=" + price + ", year=" + year + ", month=" + month
				+ ", city=" + city + ", category=" + category + ", quantity=" + quantity + "]";
	}
	
}

public class Assignment {
	
	// 1 - Find out the year with highest number of orders
	
	public static void MaxOrd(List<Orders> ord){
	    Optional<Orders> o = ord.stream()
	            .filter(f -> f.getYear() == 2020)
	            .max(Comparator.comparing(Orders::getQuantity));
	    
	    if (o.isPresent()) {
	        System.out.println(o.get().getQuantity());
	    } else {
	        System.out.println("No orders found for the year 2020.");
	    }
	}


    public static void SortedOrd(List<Orders> ord){
        Map<String, Long> res = ord.stream().collect(Collectors.groupingBy(Orders::getCategory,Collectors.counting()));
        res.forEach((k,v)-> System.out.println(k+" "+v));
    }

    public static void MaxPrice(List<Orders> ord){
        Optional<Orders> Oo = ord.stream().max(Comparator.comparing(Orders::getPrice));
        Orders or = Oo.get();
        System.out.println(or.getName()+" "+or.getPrice());
    }

     public static void AvgSpending(List<Orders> ord){
        DoubleSummaryStatistics oStat = ord.stream().collect(Collectors.summarizingDouble(Orders::getPrice));

         System.out.println("Average Spending on the site: "+oStat.getAverage());
     }

     public static void MinPrice(List<Orders> ord){
        Optional<Orders> Oo = ord.stream().min(Comparator.comparing(Orders::getPrice));
        Orders or = Oo.get();
        System.out.println("Minimum Price: "+or.getName()+" "+or.getPrice());
     }

     public static void FirstOrders(List<Orders> ord){
        Optional<Orders> ordO = ord.stream().min(Comparator.comparing(Orders::getYear).thenComparing(Orders::getMonth));
        Orders o = ordO.get();
         System.out.println(o.getName());
     }

	public static void main(String[] args) {
		
		List<Orders> ordData = new ArrayList<>();
		
		ordData.add(new Orders(134,"Raja",278.78,2024,"December","Salem","Fashion",10));
		ordData.add(new Orders(121,"Vijay",450.50,2022,"November","Erode","Furniture",4));
		ordData.add(new Orders(101,"Tharun",1178.7,2022,"July","Chennai","Electronics",5));
		ordData.add(new Orders(75,"Deva",1278.78,2024,"August","Trichy","Sports",7));
		ordData.add(new Orders(87,"Aakash",567.26,2023,"September","Erode","Sports",6));
		ordData.add(new Orders(14,"Harish",1938.78,2022,"July","Salem","Fashion",8));
		ordData.add(new Orders(198,"Kavin",2045.45,2024,"February","Trichy","Electronics",2));
		ordData.add(new Orders(67,"Ajith",3500.00,2023,"June","Chennai","Fashion",3));
		ordData.add(new Orders(184,"Kevin",1893.78,2024,"March","Salem","Furniture",4));
		ordData.add(new Orders(186,"Deva",12278.78,2024,"December","Erode","Sports",6));
		ordData.add(new Orders(79,"Vijay",4504.54,2023,"August","Trichy","Fashion",24));
		ordData.add(new Orders(34,"Tharun",7685.61,2023,"July","Chennai","Electronics",5));
		ordData.add(new Orders(190,"Harish",2125.53,2022,"November","Erode","Furniture",12));
		ordData.add(new Orders(145,"Ajith",6353.28,2022,"May","Salem","Sports",3));
		ordData.add(new Orders(46,"Kavin",1256.64,2024,"October","Erode","Furniture",6));
		
		Assignment.MaxOrd(ordData);
		Assignment.AvgSpending(ordData);
		Assignment.FirstOrders(ordData);
		// Assignment.MaxOrd(ordData);
		Assignment.MaxPrice(ordData);
		Assignment.MinPrice(ordData);
		Assignment.SortedOrd(ordData);
	
	}
}
