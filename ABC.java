
public class ABC extends XYZ implements Interface1, Interface2 {

//	public void Add() {
//		System.out.println("Calling add");
//	}
	public void Sub() {
		System.out.println("Calling sub");
	}
	public void Mul() {
		System.out.println("Calling mul");
	}
	public void Show() {
		System.out.println("Calling show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ABC ob = new ABC();
		
		ob.Add();
		ob.Mul();
		ob.Sub();
		ob.Show();
		
		Interface1 i1 = new ABC();
		i1.Add();
		i1.Sub();
	}

}
