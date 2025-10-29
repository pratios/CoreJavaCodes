package StockEntry;

public class Product {

	private int prodID;
	private String prodName;
	private float rate;
	private float gst;
	private int stockQuantity;
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int prodID, String prodName, float rate, float gst, int stockQuantity) {
		super();
		this.prodID = prodID;
		this.prodName = prodName;
		this.rate = rate;
		this.gst = gst;
		this.stockQuantity = stockQuantity;
	}
	public int getProdID() {
		return prodID;
	}
	public void setProdID(int prodID) {
		this.prodID = prodID;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

}
