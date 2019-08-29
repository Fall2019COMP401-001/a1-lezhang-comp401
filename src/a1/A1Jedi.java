package a1;

import java.util.*;

public class A1Jedi {
	public static void main(String[] args) {
		int itemsNumber, personNumber, itemNumberOfperson, itemPerPerson;
		String[] itemList = new String[1000];
		boolean[] repeatflag = new boolean[1000];
		String itemName;
		int[] itemNumber = new int[1000];
		int[] customerBuyItem = new int[1000];
		Scanner scanner = new Scanner(System.in);
		itemsNumber = Integer.valueOf(scanner.next());
		for (int i = 1; i <= itemsNumber; i++) {
			itemList[i] = scanner.next();
			scanner.next();
		}
		personNumber = Integer.valueOf(scanner.next());
		for (int i = 1; i <= personNumber; i++) {
			scanner.next();
			scanner.next();
			itemPerPerson = Integer.valueOf(scanner.next());
			for (int j = 1; j <= itemPerPerson; j++) {
				itemNumberOfperson = Integer.valueOf(scanner.next());
				itemName = scanner.next();
				for (int k = 1; k <= itemsNumber; k++) {
					if (itemName.equals(itemList[k])) {
						if (repeatflag[k] == false) {
							customerBuyItem[k] ++;
							repeatflag[k] = true;
						}
						itemNumber[k] += itemNumberOfperson;
					}
				}
			}
			for (int k = 1; k <= itemsNumber; k++) {
				repeatflag[k] = false;
			}
		}
		scanner.close();
		for (int i = 1; i <= itemsNumber; i++) {
			if (customerBuyItem[i] == 0) {
				System.out.print("No ");
				System.out.print("customers bought " +  itemList[i]);
				System.out.println();
			}
			else {
				System.out.print(customerBuyItem[i] + " ");
				System.out.print("customers bought " + itemNumber[i] + " " + itemList[i]);
				System.out.println();
			}
		}
	}
}