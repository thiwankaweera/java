import java.util.*;

class DateTest{
	private int day;
	private int month;
	private int year;
	
	public DateTest(int pDay, int pMonth, int pYear){
		day = pDay;
		month = pMonth;
		year = pYear;
	}
	
	public DateTest(DateTest pDateTest){
		day = pDateTest.getDay();
		month = pDateTest.getMonth();
		year = pDateTest.getYear();
	}
	
	public DateTest(){
		day = 1;
		month = 1;
		year = 2000;
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
	public void setDay(int pDay){
		if ((pDay > 0) && (pDay < 32)){
			day = pDay;
		}
	}
	
	public void setMonth(int pMonth){
		if ((pMonth > 0) && (pMonth < 13)){
			month = pMonth;
		}
	}
	
	public void setYear(int pYear){
		if (pYear > 0){
			year = pYear;
		}
	}
	
	public String toString(){
		return String.format("%02d/%02d/%d", day, month, year);
	}
	
	public String getSuffix(){
		String suffix;
		switch(day % 10){
			case 1:
				if(day != 11) suffix = "st";
				else suffix = "th";
				break;
			case 2:
				if(day != 12) suffix = "nd";
				else suffix = "th";
				break;
			case 3:
				if(day != 13) suffix = "rd";
				else suffix = "th";
				break;
			default:
				suffix = "th";
		}
		return suffix;
	}
	
	public boolean isLeapYear(){
		if (year % 4 == 0){
			if (year % 100 == 0){
				if (year % 400 == 0){
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
	
	public static void main(String[] args){
			DateTest date1 = new DateTest();
			DateTest date2 = new DateTest(date1);
			DateTest date3 = new DateTest(2023, 5, 8);
		
			System.out.println("Testing default constructor:");
			System.out.println("Date 1: " + date1.toString());
			System.out.println("Date 2: " + date2.toString());
			System.out.println("Date 3: " + date3.toString());
		
			System.out.println("\nTesting copy constructor:");
			System.out.println("Date 1 and Date 2 are equal: " + date1.equals(date2));
		
			System.out.println("\nTesting parameterized constructor and mutators:");
			date3.setDay(31);
			date3.setMonth(12);
			date3.setYear(2022);
			System.out.println("Date 1 and Date 3 are equal: " + date1.equals(date3));
		
			System.out.println("\nTesting getSuffix and isLeapYear methods:");
			System.out.println(date1.toString() + date1.getSuffix());
			System.out.println(date2.toString() + date2.getSuffix());
			System.out.println(date3.toString() + date3.getSuffix());
			}
		}
	

	
