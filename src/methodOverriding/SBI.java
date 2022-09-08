package methodOverriding;

public class SBI extends Bank{

	private final float rateOfInterest=7.8f;

	@Override
	public float getRateOfInterest() {
	
		return rateOfInterest;
	}
	
	

}
