public class SumOdd {
	public static boolean isOdd (int n) {
		if ((n < 1) || ((n % 2) == 0)) {
			return false;
		}
		
		return true;
	}
	
	public static int sumOdd (int start, int end) {
		if ((end < start) || (start < 1) || (end < 1)) {
			return -1;
		}
		
		int sum = 0;
		
		do {
			if (isOdd(start)) {
				sum += start;
			}
			start++;
		} while (start <= end);
	
		
		return sum;
	}
}