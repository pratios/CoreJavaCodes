package StockEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register{

	Scanner sc = new Scanner(System.in);
	List<Product> list = new ArrayList<Product>();

	public void Entry() {

		int i = 1, PID = 1;
		while(i!=0) {
			System.out.println("Enter Product name : ");
			String Pname = sc.next();
			System.out.println("Enter Product rate : ");
			float Prate = sc.nextFloat();
			System.out.println("Enter Product gst : ");
			float Pgst = sc.nextFloat();
			System.out.println("Enter Product quantity : ");
			int Pquan = sc.nextInt();
			
			Product p = new Product(PID, Pname, Prate, Pgst, Pquan);
			list.add(p);
			System.out.println("Do you want to continue?(y=1,n=0)");
			i=sc.nextInt();
			PID++;
		}
	}
	
	public void DisplayList() {
		
		float total = 0, FinalAmt = 0;
		System.out.println("\n\nThe entry of the product info is as below : ");
		
		for(Product p : list) {
			System.out.println("\nID : "+p.getProdID()+"\nName : "+p.getProdName()+"\nRatr : "+p.getRate()+"\nGST : "+p.getGst()+"\nQuantity : "+p.getStockQuantity());
			
			if(p.getStockQuantity()>0) {
				total = (p.getRate() + (p.getRate()*p.getGst())/100)*p.getStockQuantity();
				System.out.println("Total cost of the product : "+total);
			}
			
			FinalAmt = total+FinalAmt;
			
			if(p.getStockQuantity() < 0)
				System.out.println("Invalid Stock.\n");
			else if(p.getStockQuantity() == 0)
				System.out.println("Out of Stock.\n");
			else if(p.getStockQuantity()>0 && p.getStockQuantity()<10)
				System.out.println("Limited Stock.\n");
			else if(p.getStockQuantity() >= 10)
				System.out.println("Sufficient Stock.\n");
		}
		
		System.out.println("\n The Final cost of the products listed is "+FinalAmt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Register R = new Register();
		R.Entry();
		R.DisplayList();
	}

}
