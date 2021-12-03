public class PrimeNumberPrinter {
	public static void printPrimeNumbers () {
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a prime number");
			}
		}
	}
	
	public static boolean isPrime (int n) {
		if (n == 1) {
			return false;
		}
		
		// do not process any number above half of n
		for (int i = 2; i <= n/2; i++) {
			if ((n % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int getLargestPrime (int number) {
        if (number <= 1) {
            return -1;
        }
        
        int largestPrime = 0;
        
        for (int i = 2; i <= number; i++) {
            if (number % i != 0) {
                continue;
            }
			if (isPrime(i)) {
			    if (largestPrime < i) {
			        largestPrime = i;
			    }
			}
		}
		
		return largestPrime;
    }
}