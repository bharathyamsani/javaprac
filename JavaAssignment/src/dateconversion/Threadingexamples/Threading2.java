package dateconversion.Threadingexamples;

class Mythread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread());
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class Threading2 {

	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		t1.start();
		t1.join(1500);
		t2.start();
	}

}
