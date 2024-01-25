package airline;

import java.util.Arrays;

public class Person {
	private String name;
	private String nationality;
	private String dateOfBirth;
	private String passport[];
	private int seatNumber;
	
	Person(String name, String nationality, String dateOfBirth, int seatNumber){
		this.name=name;
		this.nationality=nationality;
		this.dateOfBirth=dateOfBirth;
		this.passport=new String[3];
		this.seatNumber=seatNumber;
	}
	
	Person(Person p){
		this.name=p.name;
		this.nationality=p.nationality;
		this.dateOfBirth=p.dateOfBirth;
		this.passport=Arrays.copyOf(p.passport, p.passport.length);
		this.seatNumber=p.seatNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setNationality(String nationality) {
		this.nationality=nationality;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth=dateOfBirth;
	}
	
	public void setPassport() {
		this.passport=new String[] {this.name,this.nationality,this.dateOfBirth};
	}
	
	public void setSeatNumber(int seatNumber) {
		this.seatNumber=seatNumber;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNationality() {
		return this.nationality;
	}
	
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}
	
	public int getSeatNumber() {
		return this.seatNumber;
	}
	
	public String[] getPassport() {
		return Arrays.copyOf(this.passport,3);
	}
	
	
	/**
	 * Method name:applyPassport
	 * 
	 * @return boolean
	 * 
	 * Inside the method:
	 *  1.Returns a random boolean value
	 */
	
	public boolean applyPassport() {
		int r=(int)(Math.random()*2);
		return (r==1)? true:false;
		
	}
	
	/**
	 * Method name:chooseSeat
	 * 
	 * Inside the function:
	 *  1.Sets this.seat to a random number between 1 to 11
	 *  
	 */
	
	public void chooseSeat() {
		this.seatNumber=(int)(Math.random()*11+1);
	}
	
	@Override
	public String toString() {
		return "Name:"+this.name+"\nNationality:"+this.nationality+"\nDateOfBirth:"+this.dateOfBirth+"\nSeatNumber:"+this.seatNumber+"\nPassport:"+Arrays.toString(this.passport);
	}
	
}
