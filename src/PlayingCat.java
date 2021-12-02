public class PlayingCat {
	public static boolean isCatPlaying (boolean summer, int temperature) {
		int lowerTemp = 25;
		int upperTemp = 35;
		
		if (summer) {
			upperTemp = 45;
		}
		
		if ((temperature >= lowerTemp) && (temperature <= upperTemp)) {
			return true;
		}
		
		return false;
	}
}