package labExercise;

public class InvoiceCustomer {
	
	
	private String cutomer_id="";
	private String invoice_number="";
	private double total_amount;
	
	public InvoiceCustomer(String cid, String inv_no, double amt){
		cutomer_id=cid;
		invoice_number=inv_no;
		total_amount=amt;
	}
	
	public String getCutomer_id() {
		return cutomer_id;
	}
	public void setCutomer_id(String cutomer_id) {
		this.cutomer_id = cutomer_id;
	}
	public String getInvoice_number() {
		return invoice_number;
	}
	public void setInvoice_number(String invoice_number) {
		this.invoice_number = invoice_number;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	
	
	
	
	
	
	

}
