import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> list = new ArrayList();
		List<Integer> list = new LinkedList();
		
		list.add(10);
		list.add(22);
		list.add(33);
		list.add(21);
		list.add(56);
		list.add(34);
		list.add(32);
		
		System.out.println(list);
		System.out.println("------------------------------------------------------------------");
		
		for(int i : list) {
			System.out.println(i);
		}
		
		list.add(2,36);
		System.out.println(list);
		System.out.println("------------------------------------------------------------------");
		list.remove(4);
		System.out.println("Total : "+list.size());
		System.out.println("------------------------------------------------------------------");
		System.out.println(list.get(5));
		System.out.println(list.contains(20));
		System.out.println("------------------------------------------------------------------");
		
		for(Integer i : list)
			System.out.println(i);
	}

}
