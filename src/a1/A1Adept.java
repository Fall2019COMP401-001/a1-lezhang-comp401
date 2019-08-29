package a1;

import java.util.*;

public class A1Adept {
	public static void main(String[] args) {
		String firstName, maxName = "", minName = "";
		int personNumber, itemNumber, itemOfperson, itemNumberinPerson;
		String[] nameList = new String[1000];
		String[] goodsList = new String[1000];
		double[] priceList = new double[1000];
		double[] costList = new double[1000];
		String readIn;
		double min = 10000, max = 0, sum = 0, avg;
		Scanner scanner = new Scanner(System.in);
		itemNumber = Integer.valueOf(scanner.next());
		for (int i = 1; i <= itemNumber; i++) {
			goodsList[i] = scanner.next();
			priceList[i] = Double.valueOf(scanner.next());
		}
		personNumber = Integer.valueOf(scanner.next());
		for (int i = 1; i <= personNumber; i++) {
			firstName = scanner.next();
			nameList[i] = firstName + " " + scanner.next();
			itemOfperson = Integer.valueOf(scanner.next());
			for (int j = 1; j <= itemOfperson; j++) {
				itemNumberinPerson = Integer.valueOf(scanner.next());
				readIn = scanner.next();
				for (int k = 1; k <= itemNumber; k++) {
					if (readIn.equals(goodsList[k])) {
						costList[i] += itemNumberinPerson * priceList[k];
					}
				}
			}
		}
		scanner.close();
		for (int i = 1; i <= personNumber; i++) {
			if (max < costList[i]) {
				max = costList[i];
				maxName = nameList[i];
			}
			if (min > costList[i]) {
				min = costList[i];
				minName = nameList[i];
			}
			sum += costList[i];
		}
		avg = sum / personNumber;
		System.out.println("Biggest: " + maxName + " (" + String.format("%.2f", max) + ")");
		System.out.println("Smallest: " + minName + " (" + String.format("%.2f", min) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
	}
}