package dateconversion;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class DateConversion1 {
	
	public static long convertUnix(LocalDateTime dt) {
		return dt.atZone(ZoneId.systemDefault()).toEpochSecond();
	}
	
	public static LocalDateTime convertToUTC(LocalDateTime dt) {
		return dt.atZone(ZoneId.of("Asia/Kolkata")).withZoneSameInstant(ZoneId.of("UTC")).toLocalDateTime();
	}
	
	public static LocalDateTime convertToIST(LocalDateTime dt) {
		return dt.atZone(ZoneId.of("UTC")).withZoneSameInstant(ZoneId.of("Asia/Kolkata")).toLocalDateTime();
	}
	
	public static LocalDateTime convertZone(LocalDateTime dt,String oldzone, String newzone) {
		ZonedDateTime zdt=dt.atZone(ZoneId.of(oldzone));
		ZonedDateTime newzdt=zdt.withZoneSameInstant(ZoneId.of(newzone));
		return newzdt.toLocalDateTime();
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String time=sc.nextLine();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime dt=LocalDateTime.parse(time,df);
		System.out.println(convertToUTC(dt));
		System.out.println(convertToIST(dt));
	}

}