public class TestBank{
	public static void main(String[] args){
		Bank axis = new AXIS();
		Bank icic = new ICIC();
		Bank sbi = new SBI();
		Bank bank = new Bank();

		System.out.println("Bank: " + bank.getRateOfInterest());
		System.out.println("AXIS: " + axis.getRateOfInterest());
		System.out.println("ICIC: " + icic.getRateOfInterest());
		System.out.println("SBI: " + sbi.getRateOfInterest());
	}
}