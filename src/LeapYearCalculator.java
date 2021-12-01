public class LeapYearCalculator {
	public static boolean isLeapYear (int year) {
		if ((year < 1) || (year > 9999)) {
			return false;
		}
		
		boolean isLeapYear = false;
		
		if ((year % 4) == 0) {
			isLeapYear = true;
			
			if (((year % 100) == 0) && ((year % 400) != 0)) {
				isLeapYear = false;
			}
		}
		
		return isLeapYear;
	}
}