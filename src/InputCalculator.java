import java.util.Scanner;

public class InputCalculator {
	public static void inputThenPrintSumAndAverage () {
		int counter = 0;
		int sum = 0;
		long avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			if (!scanner.hasNextInt()) {
				break;
			}
			
			sum += scanner.nextInt();
			counter++;
		}
		
		if (counter > 0) {
			avg = Math.round((double)sum / (double)counter);
		}
		
		System.out.println("SUM = " + sum + " AVG = " + avg);
		
		scanner.close();
	}
}