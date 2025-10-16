package College;

public class BCA extends CollegeDetails implements Department {

	public void Admission() {
		System.out.println("Calling BCA admisiion");
	}
	public void Lectures() {
		System.out.println("Calling BCA Lectures");
	}
	public void Exams() {
		System.out.println("Calling BCA Exams");
	}
	public void Result() {
		System.out.println("Calling BCA Results");
	}
	public void AnnualExpense() {
		System.out.println("Calling BCA AnnualExpense");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BCA ob = new BCA();
		ob.Admission();
		ob.AnnualExpense();
		ob.Exams();
		ob.Lectures();
		ob.Result();
	}

}
