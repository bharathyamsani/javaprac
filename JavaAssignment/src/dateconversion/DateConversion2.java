package dateconversion;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class DateConversion2 {
	
	public static LocalDateTime addDays(LocalDateTime dt,long n) {
		return dt.plusDays(n);
	}
	
	public static LocalDateTime subtractDays(LocalDateTime dt,long n) {
		return dt.minusDays(n);
	}
	
	public static LocalDateTime addHours(LocalDateTime dt,long n) {
		return dt.plusHours(n);
	}
	
	public static LocalDateTime addTime(LocalDateTime dt,long hrs,long min) {
		return dt.plusHours(hrs).plusMinutes(min);
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String datetime=sc.nextLine();
		LocalDateTime dt=LocalDateTime.parse(datetime,dtf);
		System.out.println(addDays(dt,1L));
		System.out.println(subtractDays(dt,10));
		System.out.println(addHours(dt,1));
		System.out.println(addTime(dt,5,30));
	}

}
