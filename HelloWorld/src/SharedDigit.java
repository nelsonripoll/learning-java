public class SharedDigit {
	public static boolean hasSharedDigit (int a, int b) {
		if ((a < 10) || (b < 10) || (a > 99) || (b > 99)) {
			return false;
		}
		
		
		int c = b; // copy
		int d = 0; // placeholder
		
		do {
			d = a % 10; // get last digit
			a /= 10;
			do {
				if (d == (b % 10)) {
					return true;
				}
				b /= 10;
			} while (b != 0);
			b = c; // reset
		} while (a != 0);
		
		return false;
	}
	
	public static boolean hasSameLastDigit (int a, int b, int c) {
		if (!isValid(a) || !isValid(b) || !isValid(c)) {
			return false;
		}
		
		a %= 10;
		b %= 10;
		c %= 10;
		
		if ((a == b) || (a == c) || (b == c)) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isValid (int n) {
		if ((n < 10) || (n > 1000)) {
			return false;
		}
		
		return true;
	}
}