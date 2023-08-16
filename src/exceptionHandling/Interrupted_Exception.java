package exceptionHandling;

public class Interrupted_Exception {	
	public static void main(String... args) throws InterruptedException {
		Thread.sleep(2000);
		Thread.currentThread().interrupt();
		if(Thread.interrupted()) {
			throw new InterruptedException();
		}
	}
}

