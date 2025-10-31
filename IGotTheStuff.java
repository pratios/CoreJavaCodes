package multiple_classes_threading;

public class IGotTheStuff extends Thread{

	public void Data(String s) {
		
		for(int i=1; i<=2; i++) {
			System.out.println(s);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		}
	}
}
