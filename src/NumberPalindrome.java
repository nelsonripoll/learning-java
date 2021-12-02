public class NumberPalindrome {
  public static boolean isPalindrome (int n) {  
	  if (n < 0) {
		  n *= -1; // make positive
	  }
	  
	  if (n < 10) {
		  return true; // always a palindrome
	  }
	  
	  int reverse = 0;
	  int copy = n;
	  
	  while (copy != 0) {
		  reverse += copy % 10;
		  copy /= 10;
		  
		  if (copy != 0) {
			  reverse *= 10;
		  }
	  }
	  
	  return n == reverse;
  }
}