package Clocky;

import Clocky.NumbersAuto;

public class ClockDisplayAuto {
	public static void main(String[] args) {
	NumbersAuto Hour = new NumbersAuto();
	NumbersAuto Minute = new NumbersAuto();
	
	int increment = 0;
	int hour = Hour.getHour();
	int minute = Minute.getMinute();
	
	System.out.println("the time is "+hour+":"+minute);
	
}
}