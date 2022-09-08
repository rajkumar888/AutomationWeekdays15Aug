package methodOverriding;

public class ICICI extends Bank{

	private final float rateOfInterest=8.5f;

	@Override
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	
	

}
