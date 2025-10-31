package multiple_classes_threading;

public class Junkie2 extends Thread{

		IGotTheStuff Halfkg;
		String s;
		
		public Junkie2(IGotTheStuff Halfkg, String s) {
			// TODO Auto-generated constructor stub
			this.Halfkg=Halfkg;
			this.s=s;
		}
		
		public void run() {
			synchronized (Halfkg) {
				Halfkg.Data(s);
			}
		}
}
