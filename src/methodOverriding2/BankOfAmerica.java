package methodOverriding2;

public class BankOfAmerica implements Bank{

	float rateOfInterest;
	
	public BankOfAmerica(float rateOfInterest){
		this.rateOfInterest=rateOfInterest;
	}
	
	
	@Override
	public float getRateOfInterest() {
		return rateOfInterest;
	}

}
