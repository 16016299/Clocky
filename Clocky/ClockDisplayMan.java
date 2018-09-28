package Clocky;

import Clocky.NumbersMan;

public class ClockDisplayMan {
	public static void main(String[] args) {
		NumbersMan numbers = new NumbersMan();
		int tick = 0;
		numbers.setHour();//bases times off human input
		numbers.setMinute();
		
		while(tick < 2){//displays time for every tick
			System.out.println("the time is "+numbers.getHour()+":"+numbers.getMinute());
			numbers.increment();//gets increment to increase time
		tick++;
		}//closesloop

	}//closes main
}//closes class