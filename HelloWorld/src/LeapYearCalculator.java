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
	
    public static int getDaysInMonth (int month, int year) {      
        if ((year < 1) || (year > 9999)) {
            return -1;
        }
        
        int days = -1;
        switch (month) {
        	case 1:  days = 31; break;
        	case 2:  days = isLeapYear(year) ? 29 : 28; break;
        	case 3:  days = 31; break;
        	case 4:  days = 30; break;
        	case 5:  days = 31; break;
        	case 6:  days = 30; break;
        	case 7:  days = 31; break;
        	case 8:  days = 31; break;
        	case 9:  days = 30; break;
        	case 10: days = 31; break;
        	case 11: days = 30; break;
        	case 12: days = 31; break;
        }
        
        return days;
    }
}