public class NumberToWords {
	public static int reverse (int number) {
		int reverse = 0;
		do {
			reverse += number % 10;
			number /= 10;
			if (number != 0) {
				reverse *= 10;
			}
		} while (number != 0);
		return reverse;
	}
	
	public static int getDigitCount (int number) {
		if (number < 0) {
			return -1;
		}
		
		int count = 0;
		
		do {
			count++;
			number /= 10;
		} while (number != 0);
		
		return count;
	}
	
	public static void numberToWords (int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		}
		
		int reverse = reverse(number);
		int count = getDigitCount(number);
		int lastDigit = 0;
		
		for (int i = 1; i <= count; i++) {
			lastDigit = reverse % 10;
			reverse /= 10;
			
			switch (lastDigit) {
				case 0: System.out.println("Zero");  break;
				case 1: System.out.println("One");   break;
				case 2: System.out.println("Two");   break;
				case 3: System.out.println("Three"); break;
				case 4: System.out.println("Four");  break;
				case 5: System.out.println("Five");  break;
				case 6: System.out.println("Six");   break;
				case 7: System.out.println("Seven"); break;
				case 8: System.out.println("Eight"); break;
				case 9: System.out.println("Nine");  break;
			}
		}
	}
}