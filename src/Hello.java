public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		
		
		/*
		 * PRIMITIVE TYPES
		 * char, boolean, int, byte, short, long, float, double
		 */
		
		// char
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		
		System.out.println("Char Value = " + myChar);
		System.out.println("Unicode Char Value = " + myUnicodeChar);
		
		
		// boolean
		boolean myTrueBoolean = true;
		boolean myFalseBoolean = false;
		
		System.out.println("True Value = " + myTrueBoolean);
		System.out.println("False Value = " + myFalseBoolean);
		
		
		// int
		int myMinIntVar = Integer.MIN_VALUE;
		int myMaxIntVar = Integer.MAX_VALUE;
		
		System.out.println("Integer Minimum Value = " + myMinIntVar); // -2147483648
		System.out.println("Integer Maximum Value = " + myMaxIntVar); //  2147483647
		
		System.out.println("Busted MIN Integer Value = " + (myMinIntVar - 1)); //  2147483647
		System.out.println("Busted MAX Integer Value = " + (myMaxIntVar + 1)); // -2147483648
		
		int myIntVar = 2_147_483_647; // use underscores as separators for large values
		
		System.out.println(myIntVar); // 2147483647
		
		
		// byte
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		System.out.println("Byte Minimum Value = " + myMinByteValue); // -128
		System.out.println("Byte Maximum Value = " + myMaxByteValue); //  127
		
		
		// short
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		System.out.println("Short Minimum Value = " + myMinShortValue); // -32768
		System.out.println("Short Maximum Value = " + myMaxShortValue); //  32767
		
		
		// long
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("Long Minimum Value = " + myMinLongValue); // -9223372036854775808
		System.out.println("Long Maximum Value = " + myMaxLongValue); //  9223372036854775807
		
		System.out.println("Busted MIN Long Value = " + (myMinLongValue - 1)); //  9223372036854775807
		System.out.println("Busted MAX Long Value = " + (myMaxLongValue + 1)); // -9223372036854775808
		
		long myLongValue = 100L;
		
		
	    // float
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		
		System.out.println("Float Minimum Value = " + myMinFloatValue); // 1.4E-45, 1.4 * 10^-45
		System.out.println("Float Maximum Value = " + myMaxFloatValue); // 3.4028235E38, 3.4028235 * 10^38
		
		float myFloatValue1 = 5f;
		float myFloatValue2 = 5.25f;
		float myFloatValue3 = (float) 5.25; // literal value is double by default, cast as float
		
		
		// double
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		
		System.out.println("Float Minimum Value = " + myMinDoubleValue); // 4.9E-324, 4.9 * 10^-324
		System.out.println("Float Maximum Value = " + myMaxDoubleValue); // 1.7976931348623157E308, 1.7976931348623157 * 10^308
		
		double myDoubleValue1 = 5;
		double myDoubleValue2 = 5.25; // literal value is already a double, no need to cast
		double myDoubleValue3 = 5.25d;
		
		
		/*
		 * ARITHMATIC
		 * addition, subtraction, multiplication, division, modulus, increment, decrement
		 */

		int answer;
		
		// addition
		answer = 5 + 10;
		System.out.println(answer); // 15
		
		
		// subtraction
		answer = 37 - 21;
		System.out.println(answer); // 16
		
		
		// multiplication
		answer = 2 * 4;
		System.out.println(answer); // 8
		
		
		// division
		answer = 100 / 25;
		System.out.println(answer); // 4
		
		
		// modulus
		answer = 10 % 2;
		System.out.println(answer); // 0
		
		answer = 25 % 7;
		System.out.println(answer); // 4

		
		// increment & decrement
		myIntVar = 5;
		
		answer = ++myIntVar;
		System.out.println(answer); // 6
		
		answer = --myIntVar;
		System.out.println(answer); // 5
	}
}