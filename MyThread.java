
public class MyThread extends Thread{
	
	public void run() {
		
		for(int i=1; i<=5; i++) {
		System.out.println("Calling my thread "+i);
		try {
			Thread.sleep(5000);
		}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread ob = new MyThread();
		ob.start();
	}

}
