public class TestBank{
	public static void main(String[] args){
		PNB mPNB = new PNB();
		SBI mSBI = new SBI();

		System.out.println("PNB: " + mPNB.getRateOfInterest());
		System.out.println("SBI: " + mSBI.getRateOfInterest());
	}
}