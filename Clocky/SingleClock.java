package Clocky;

import java.util.Scanner;

public class SingleClock {

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		int hour = 0, minute = 0, counter = 1;
		
		do{
			if((hour < 0)||(hour > 24)){
				System.out.println("please enter hour again in 24 hour clock time");
			}
			System.out.println("what hour is it in 24 clock time?");
			hour = kboard.nextInt();
		}while((hour < 0)||(hour > 24));
		
		do{
			if((minute < 0)||(minute > 60)){
				System.out.println("Please enter a minute between 00 and 60");
			}
			System.out.println("what minute is it?");
			minute = kboard.nextInt();
		}while((minute < 0)||(minute > 60));
			
		while(counter < 3){	
		System.out.println("The time is "+hour+":"+minute);
		minute = minute + 1;
		if(minute >= 60){
			minute = 00;
			hour = hour + 1;
		}
		counter = counter + 1;
		}
	kboard.close();
	}

}
