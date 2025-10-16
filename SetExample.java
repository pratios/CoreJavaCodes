import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	void SetDemo() {
		
//		Set<Integer> st = new TreeSet<>();
		Set<Integer> st = new HashSet<>();

		st.add(10);
		st.add(10);
		st.add(3);
		st.add(76);
		st.add(256);
		st.add(85);
		st.add(53);
		st.add(33);
		st.add(565);
		st.add(44);
		st.add(21);

		System.out.println(st);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SetExample ob = new SetExample();
		ob.SetDemo();
	}

}
