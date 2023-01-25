package udemy_java_eclipse_exercises;

public class InvoiceItem {
	
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;

	public InvoiceItem(String ID, String description, int quantity, double unitPrice) {
		this.id = ID;
		this.desc = description;
		this.qty = quantity;
		this.unitPrice = unitPrice;
		
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getQty() {
		return this.qty;
		
	}
	
	public double getUnitPrice() {
		return this.unitPrice;
	}
	
	
	public void setQty(int quantity) {
		this.qty = quantity;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public double getTotal() {
		return this.unitPrice * this.qty;
	}
	
	public String toString() {
		return "InvoiceItem [id = "+this.id+ ", desc = "+this.desc+ ", qty = " +this.qty+ ", unitPrice = "+this.unitPrice+ "]";
	}
	

}
