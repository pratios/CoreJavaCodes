package multiple_classes_threading;

public class Junkie3 extends Thread{

	IGotTheStuff Pausher;
	String s;
	
	public Junkie3(IGotTheStuff Pausher, String s) {
		// TODO Auto-generated constructor stub
		this.Pausher=Pausher;
		this.s=s;
	}
	
	public void run() {
		synchronized (Pausher) {
			Pausher.Data(s);
		}
	}
}
