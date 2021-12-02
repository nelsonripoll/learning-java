public class FirstAndLastSum {
	public static int sumFirstAndLastDigit (int number) {
		if (number < 0) {
			return -1;
		}
		
		int sum = 0;
		
		// last digit
		sum += number % 10;
		
		do {
			if ((number / 10) == 0) {
				// first digit
				sum += number % 10;
			}
			
			number /= 10;
		} while (number != 0);
		
		return sum;
	}
}