package a1;

import java.util.Scanner;

public class A1Novice {
	public static void main(String[] args) {
		char initial;
		int personNumber, itemNumber;
		String[] nameList = new String[1000];
		double[] costList = new double[1000];
		String[] costListStr = new String[1000];
		String readIn;
		Scanner scanner = new Scanner(System.in);
		personNumber = Integer.valueOf(scanner.next());
		for (int i = 1; i <= personNumber; i ++) {
			initial = scanner.next().charAt(0);
			nameList[i] = initial + ". " + scanner.next();
			itemNumber = Integer.valueOf(scanner.next());
			for (int j = 1; j <= itemNumber; j ++) {
				readIn = scanner.next();
				scanner.next();
				costList[i] += Double.valueOf(scanner.next()) * Integer.valueOf(readIn);
			}
			costListStr[i] = String.format("%.2f", costList[i]);
		}
		scanner.close();
		for (int i = 1; i <= personNumber; i ++) {
			System.out.println(nameList[i] + ": "+ costListStr[i]);
		}
	}
}
		