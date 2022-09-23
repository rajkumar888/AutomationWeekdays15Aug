package labExercise;

import java.util.Scanner;

public class CustomerInvImpl {

	public static void main(String[] args) {

		InvoiceCustomer[] test = new InvoiceCustomer[6];

		test[0] = new InvoiceCustomer("Customer1", "Inv_001", 1034.67);
		test[1] = new InvoiceCustomer("Customer2", "Inv_002", 1222.67);
		test[2] = new InvoiceCustomer("Customer3", "Inv_003", 1333.67);
		test[3] = new InvoiceCustomer("Customer4", "Inv_004", 323434.67);
		test[4] = new InvoiceCustomer("Customer5", "Inv_005", 2342345.67);

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter customer name : ");
		String customername = scan.nextLine();
		System.out.print("Enter invoice number name : ");
		String invoice_number = scan.nextLine();
		System.out.print("Enter amount : ");
		double amount = scan.nextDouble();
		test[5] = new InvoiceCustomer(customername, invoice_number, amount);
		
		for (int i = 0; i < test.length; i++) {
			System.out.println(
					test[i].getCutomer_id() + " " + test[i].getInvoice_number() + " " + test[i].getTotal_amount());
		}

	}

}
