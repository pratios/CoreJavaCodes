package multiple_classes_threading;

public class Dealer extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IGotTheStuff ob =new IGotTheStuff();
		Junkie1 J1 = new Junkie1(ob, "Junkie1 got 1kg supply.");
		Junkie2 J2 = new Junkie2(ob, "Junkie2 got 500g supply.");
		Junkie3 J3 = new Junkie3(ob, "Junkie3 got 250g supply.");
		J1.start();
		J2.start();
		J3.start();
	}

}
