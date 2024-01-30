package dateconversion;

import java.util.*;
import java.time.*;
import java.time.format.*;

public class DateSorting {
	
	public static void main(String args[]) {
		ArrayList<LocalDate> al=new ArrayList<>();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arraylist:");
		int n=sc.nextInt();
		while(n-->0) {
			System.out.println("Enter a date:");
			al.add(LocalDate.parse(sc.next(),dtf));
		}
		System.out.println("Before Sorting:\n"+al);
		Collections.sort(al);
		System.out.println("After Sorting:\n"+al);
		al.sort((LocalDate d1,LocalDate d2)->d2.compareTo(d1));
		System.out.println("After Sorting:\n"+al);
	}
}
