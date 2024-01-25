package movies;

import java.util.*;

public class Main {
	public static void main(String []args) {
		Movie[] mv=new Movie[]{
			new Movie("The Shawshank Redemption", "BlueRay", 9.2),
			new Movie("The Godfather", "BlueRay", 9.1),
			new Movie("The Godfather: Part II", "DVD", 9.0),
			new Movie("The Dark Knight", "BlueRay", 9.0),
			new Movie("Schindler's List", "DVD", 8.9),
			new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
			new Movie("Pulp Fiction", "DVD", 8.8),
			new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
		};
		Store s=new Store();
		for(int i=0;i<mv.length;i++) {
			s.setMovie(i,mv[i]);
		}
		
		printStore(s);

    }

    public static void printStore(Store s) {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(s);
    }
}