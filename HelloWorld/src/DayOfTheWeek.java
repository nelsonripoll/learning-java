public class DayOfTheWeek {
	public static void printDayOfTheWeek (int day) {
		String dayOfWeek = "Invalid day";
		
		switch (day) {
			case 0:
				dayOfWeek = "Sunday";
				break;
			case 1:
				dayOfWeek = "Monday";
				break;
			case 2:
				dayOfWeek = "Tuesday";
				break;
			case 3:
				dayOfWeek = "Wedenesday";
				break;
			case 4:
				dayOfWeek = "Thursday";
				break;
			case 5:
				dayOfWeek = "Friday";
				break;
			case 6:
				dayOfWeek = "Saturday";
				break;
		}
		
		System.out.println(dayOfWeek);
	}
}