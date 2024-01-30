package dateconversion;

import java.util.*;

class Node{
	int val;
	Node(int val){
		this.val=val;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(val);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return val == other.val;
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.val);
	}
	
}

public class SortingObjects{
	
	
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Node> s=new HashSet<>();
		System.out.println("Enter no.of objects:");
		ArrayList<Node> al=new ArrayList<>();
		int n=sc.nextInt();
		while(n-->0) {
			System.out.println("Enter a value:");
			Node node=new Node(sc.nextInt());
			s.add(node);
			al.add(node);
		}
		System.out.println(al+" "+s);
		al=new ArrayList(s);
		al.sort((Node n1,Node n2)->n1.val-n2.val);
		System.out.println("After Sorting:\n"+al);
	}

}
