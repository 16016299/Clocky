package Clocky;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class NumbersAuto {
	int hour, minute;
	
	GregorianCalendar gcalendar = new GregorianCalendar();
	
	public int getHour(){
		hour = gcalendar.get(Calendar.HOUR);
		return hour;
	}
	public int getMinute(){
		minute = gcalendar.get(Calendar.MINUTE);
		return minute;
	}

}
