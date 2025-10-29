import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Hello");
		ar1.add("there!");
		System.out.println(ar1);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Second");
		ar2.add("ArrayList");
		System.out.println(ar2);
		
		ar1.addAll(ar2);
		
		System.out.println(ar1);
	}

}
