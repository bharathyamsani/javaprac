package dateconversion.Threadingexamples;

class Threading extends Thread {

	public int n;

	Threading(int n) {
		this.n = n;
	}

	public void run() {
		mul(n);
	}

	synchronized public void mul(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(n * (i + 1));
		}
	}
}

public class Threading3 {
	public static void main(String[] args) {
		Threading p = new Threading(5);
		Threading c = new Threading(10);
		p.start();
		c.start();
	}
}
