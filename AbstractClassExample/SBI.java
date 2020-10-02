public class SBI extends Bank{
	float rateOfInterest = 7f;

	@Override
	public float getRateOfInterest(){
		return rateOfInterest/100;
	}
}
