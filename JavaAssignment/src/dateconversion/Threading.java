package dateconversion;
//

class MyThread extends Thread {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread");
	}
}

//class MyThread implements Runnable {
//
//	public void run() {
//		System.out.println("Thread is running");
//	}
//}

public class Threading {

	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = new MyThread();
		Thread thread = new Thread(runnable);
		thread.start();
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(thread.getPriority());
		thread.setPriority(1);
		System.out.println(thread.getPriority());
		System.out.println(thread.isAlive());
	}

}
