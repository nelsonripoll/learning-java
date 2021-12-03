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
		 * STRING
		 * a special datatype in Java that is actually a class not a primitive data type
		 * limited by memory or the MAX_VALUE of an int which was 2.14 billion
		 * immutable after created
		 */
		
		 String myString = "This is a string.";
		 System.out.println(myString);
		 
		 myString += " Adding on to this string.";
		 System.out.println(myString);
		 
		 myString += " Adding a unicode: \u00A9 2019.";
		 System.out.println(myString);
		 
		 String numberString = "250.55";
		 numberString += 49.95; // will not perform an arithmetic operation, just concatenation
		 System.out.println(numberString); // 250.5549.95
		 
		 
		/*
		 * ARITHMETIC
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
		
		

		/*
		 * IF-THEN-ELSE STATEMENT
		 */
		
		if (true) {
			System.out.println("This will print.");
		}
		
		if (false) {
			System.out.println("This will NOT print.");
		} else {
			System.out.println("This will print.");
		}
		
		if (false) {
			System.out.println("This will NOT print.");
		} else if (true) {
			System.out.println("This will print.");
		} else {
			System.out.println("This will NOT print.");
		}
		
		
		/*
		 * COMPARISON OPERATORS
		 */
		
		if (true == false) {
			System.out.println("This will NOT print.");
		}
		
		if (true != false) {
			System.out.println("This will print.");
		}
		
		if (50 > 40) {
			System.out.println("This will print.");
		}
		
		if (10 >= 10) {
			System.out.println("This will print.");
		}
		
		if (25 < 20) {
			System.out.println("This will NOT print.");
		}
		
		if (10 <= 10) {
			System.out.println("This will print.");
		}
		
		// compare object type
		if (myString instanceof String) {
			System.out.println("This will print.");
		}
		
		
		/*
		 * LOGICAL AND (&&) OR (||) OPERATORS
		 */
		
		if ((10 < 20) && (5 < 10)) {
			System.out.println("This will print.");
		}
		
		if ((10 < 20) && (10 < 5)) {
			System.out.println("This will NOT print.");
		}
		
		if ((10 < 20) || (10 < 5)) {
			System.out.println("This will print.");
		}
		
		
		/*
		 * TERNARY OPERATOR
		 * this is a shorthand version of if-then-else
		 */
		
		boolean isTrue = myTrueBoolean ? true : false;
		
		if (isTrue) {
			System.out.println("This will print.");
		}
		
		isTrue = myFalseBoolean ? true : false;
		
		if (isTrue) {
			System.out.println("This will NOT print.");
		}
		
		
		/*
		 * SWITCH STATEMENT
		 */
		
		int switchValue = 3;
		
		switch (switchValue) {
			case 1:
				System.out.println("Value = 1");
				break;
			case 2:
				System.out.println("Value = 2");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("Value is either 3, 4, 5"); // this will print
				break;
			default:
				System.out.println("Value unknown");
				break;
		}
		
		
		/*
		 * STRING PARSING
		 */
		
		String numberAsString = "1234";
		int number = Integer.parseInt(numberAsString);
		
		numberAsString += 1; // 12341
		number += 1; // 1235
		
		String doubleAsString = "10.25";
		double numberD = Double.parseDouble(doubleAsString);
	}
}