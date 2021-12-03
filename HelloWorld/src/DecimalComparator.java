public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces (double val1, double val2) {
		val1 = ((long)(val1 * 1e3)) / 1e3;
		val2 = ((long)(val2 * 1e3)) / 1e3;
		
		if (val1 == val2) {
			return true;
		}
		
		return false;
	}
}