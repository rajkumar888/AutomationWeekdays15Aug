package day2.rangedemo;

public class InvoiceImpl {

	
	
	public static void main(String[] args) {
		
		Invoice obj = new Invoice();
		
		System.out.println(obj.getInvoice_number());
		
		obj.setInvoice_number("inv_1001");
		
		System.out.println(obj.getInvoice_number());
		
		System.out.println(".................");
		System.out.println(obj.getPrice());
		
		obj.setPrice(450.67);
		
		System.out.println(obj.getPrice());
	}

}
