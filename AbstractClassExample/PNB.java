public class PNB extends Bank{
	
	float rateOfInterest = 5f;

	@Override
	public float getRateOfInterest(){
		return rateOfInterest/100;
	}

}