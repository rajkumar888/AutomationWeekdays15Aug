package labExercise;

public class StateBankOfWorld implements Bank{

	float rateOfInterest;
	
	public StateBankOfWorld(float rateOfInterest){
		this.rateOfInterest=rateOfInterest;
	}
	
	
	@Override
	public float getRateOfInterest() {
		return rateOfInterest;
	}

}
