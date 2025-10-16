import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mp = new TreeMap<>();
		mp.put(3,"Pune");
		mp.put(5,"Nashik");
		mp.put(2,"Mumbai");
		mp.put(7,"Goa");
		mp.put(4,"Panaji");

		for(String m : mp.values()) {
			System.out.println(m);
		}
		System.out.println("------------------------------------------------------------------");

		for(Integer m : mp.keySet()) {
			System.out.println(m);
		}
		System.out.println("------------------------------------------------------------------");

		for(var m : mp.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}

}
