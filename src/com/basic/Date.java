package com.basic;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString() {
		String dayStr,monthStr;
		if(day<10) {
			dayStr = "0"+day;
		} else {
			dayStr = ""+day;
		}
		if(month<10) {
			monthStr = "0"+month;
		} else {
			monthStr = ""+month;
		}
		
		return dayStr+"/"+monthStr+"/"+year;
	}
	
	
	
}
