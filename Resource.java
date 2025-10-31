package SynchronizingThreads;

public class Resource {

	public void Data(String s) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(s);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
