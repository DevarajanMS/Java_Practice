package com.test;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class CricketersTest {

	Cricketers crt1;
	static String name;
	static int matches;
	static int innings;
	static int runs;
	static int average;
	static double strikerate;
	@BeforeClass
	public static void beforeClass() {
		
		name ="Dhoni";
		matches = 500;
		innings = 398;
		runs = 15284;
		average = runs/matches;
		strikerate = 102.34;
		
		System.out.println("Started Testing");
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("All test cases completed");
	}
	
	@Before
	public void setUp() {
		System.out.println();
		
		crt1 = new Cricketers("Dhoni",500,398,15284,0,102.34);
		crt1.updateData();
	}
	
	@After
	public void setDown() {
		System.out.println("Dereferenced the created object");
		crt1 = null;
	}
	
	@Test
	public void testName() {
		System.out.println("Name tested");
		
		assertEquals(name,crt1.getName());
	}
	
	@Test
	public void testAverage() {
		System.out.println("Average tested");
		
		assertEquals(average,crt1.getAverage());
	}
}
