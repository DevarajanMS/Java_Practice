package com.Practice;
import java.util.Scanner;
class Order{
	private int id;
	private String name;
	private int qnty;
	private int price;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int qnty) {
		this.qnty = qnty;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getQuanity(){
		return qnty;
	}
	public int getPrice(){
		return price;
	}
}
 
public class EncapsExampla {
	public static void main(String[] args) {
		Order n1 = new Order();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your ID: ");
		n1.setId(sc.nextInt());
		System.out.print("Enter product name: ");
		n1.setName(sc.next());
		System.out.print("Enter Quantity: ");
		n1.setQuantity(sc.nextInt());
		System.out.print("Enter Price: ");
		n1.setPrice(sc.nextInt());
		
		System.out.println("Provided Information: ");
		System.out.println("Id: "+n1.getId()+"\n"+"Name: "+n1.getName()+"\nQuantity: "+n1.getQuanity()+"\nPrice: "+n1.getPrice());
		sc.close();
	}
}
