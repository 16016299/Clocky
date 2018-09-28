package Clocky;

import java.util.Scanner;


public class NumbersMan {
	Scanner kboard = new Scanner(System.in);
	private int hour = 0, minute = 0;//declares variables
	
	public void setHour(){//gets hour from human input
		do{
			if((hour < 0)||(hour > 24)){
				System.out.println("please enter hour again in 24 hour clock time");
			}
			System.out.println("what hour is it in 24 clock time?");
			hour = kboard.nextInt();
		}while((hour < 0)||(hour > 24));
	}
	
	public void setMinute(){//gets minute from human input
		do{
			if((minute < 0)||(minute > 60)){
				System.out.println("Please enter a minute between 00 and 60");
			}
			System.out.println("what minute is it?");
			minute = kboard.nextInt();
		}while((minute < 0)||(minute > 60));
	}
	
	public int getHour(){//returns hour to display
		
		return this.hour;
	}
	
	public int getMinute(){//returns hour to display
		return this.minute;
	}
	
	public void increment(){//increases time
		this.minute++;
		if(this.minute > 59){
			this.minute = 0;
			this.hour++;
			if(this.hour>24){
				hour = 0;
			}
		}
	}

}
