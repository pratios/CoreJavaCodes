package multiple_classes_threading;

public class Junkie1 extends Thread{

	IGotTheStuff Onekg;
	String s;
	
	public Junkie1(IGotTheStuff Onekg, String s) {
		// TODO Auto-generated constructor stub
		this.Onekg=Onekg;
		this.s=s;
	}
	
	public void run() {
		synchronized (Onekg) {
			Onekg.Data(s);
		}
	}
}
