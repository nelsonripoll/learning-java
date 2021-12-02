public class AllFactors {
	public static void printFactors (int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		
		for (int i = 1; i <= number; i++) {
			if ((number % i) == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPerfectNumber (int number) {
		if (number < 1) {
			return false;
		}
		
		int sum = 0;
		for (int i = 1; i <= (number / 2); i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}
		
		if (sum == number) {
			return true;
		}
		
		return false;
	}
}