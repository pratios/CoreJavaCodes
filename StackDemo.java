import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(80);
		st.push(50);
		st.push(40);
		st.push(70);

		int n = st.size();
		System.out.println("Count : "+st.size());
		
		for(int i=1; i<=n; i++)
			System.out.println(st.pop());
	}

}
