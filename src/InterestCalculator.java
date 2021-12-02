public class InterestCalculator {
	public static void printInterest () {
		for (int i = 0; i < 5; i++) {
			System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
		}
	}
	
	public static double calculateInterest (double amount, double interestRate) {
		return (amount * (interestRate/100));
	}
}