package methodOverriding;

public class BankImpl {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		
		ICICI icici = new ICICI();
		
		System.out.println("SBI rate of interest is "+sbi.getRateOfInterest());
		
		System.out.println("ICICI rate of interest is "+icici.getRateOfInterest());

	}

}
