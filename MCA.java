package College;

public class MCA implements Department {

	public void Admission() {
		System.out.println("Calling MCA admisiion");
	}
	public void Lectures() {
		System.out.println("Calling MCA Lectures");
	}
	public void Exams() {
		System.out.println("Calling MCA Exams");
	}
	public void Result() {
		System.out.println("Calling BCA Results");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department ob = new MCA();
		ob.Admission();
		ob.Exams();
		ob.Lectures();
	}

}
