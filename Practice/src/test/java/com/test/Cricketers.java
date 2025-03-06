package com.test;

public class Cricketers {
	
	private String name;
	private int matches;
	private int innings;
	private int runs;
	private int average;
	private double strikerate;
	
	
	public Cricketers(String name, int matches, int innings, int runs, int average, double strikerate) {
		this.name = name;
		this.matches = matches;
		this.innings = innings;
		this.runs = runs;
		this.average = average;
		this.strikerate = strikerate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}


	public int getInnings() {
		return innings;
	}


	public void setInnings(int innings) {
		this.innings = innings;
	}


	public int getRuns() {
		return runs;
	}


	public void setRuns(int runs) {
		this.runs = runs;
	}


	public int getAverage() {
		return average;
	}


	public void setAverage(int average) {
		this.average = average;
	}


	public double getStrikerate() {
		return strikerate;
	}


	public void setStrikerate(double strikerate) {
		this.strikerate = strikerate;
	}
	
	
	public void updateData() {
		this.average = this.runs/this.matches;
	}
	
}
