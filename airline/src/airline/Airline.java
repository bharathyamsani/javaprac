package airline;

import java.util.*;

public class Airline {
	
	private Person []people;
	
	Airline(){
		people=new Person[11];
	}
	
	public void setPerson(Person p) {
		this.people[p.getSeatNumber()-1]=new Person(p);
	}
	
	public Person getPerson(int index) {
		return new Person(this.people[index]);
	}
	
	public void createReservation(Person p) {
		int i=p.getSeatNumber()-1;
		while(this.people[i]!=null) {
			System.out.println("\n" + p.getName() + ", seat: " + p.getSeatNumber() + " is already taken. Please choose another seat.\n");
			p.chooseSeat();
			i=p.getSeatNumber()-1;
		}
		this.people[i]=new Person(p);
		System.out.println("Thank you "+p.getName()+" for flying with us. Your seat number is:"+p.getSeatNumber()+".\n");
	}

}
