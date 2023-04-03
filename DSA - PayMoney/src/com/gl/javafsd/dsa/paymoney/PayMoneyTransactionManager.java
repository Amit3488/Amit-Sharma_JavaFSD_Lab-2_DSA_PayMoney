package com.gl.javafsd.dsa.paymoney;

import java.util.Scanner;

public class PayMoneyTransactionManager {

	private Scanner input;

	public PayMoneyTransactionManager() {

	}

	public void process() {

		input = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		int transactionArraySize = input.nextInt();
		int[] transactions = new int[transactionArraySize];

		System.out.println("Enter the values of array:");
		for (int index = 0; index < transactionArraySize; index++) {

			transactions[index] = input.nextInt();
			input.nextLine();
		}

		System.out.println("Enter the total no of targets that needs to be achieved:");
		int transactionsInstanceSize = input.nextInt();

		while (transactionsInstanceSize-- != 0) {
			int flag = 0;

			long target;
			System.out.println("enter the value of target");
			target = input.nextInt();
			long sum = 0;
			for (int index = 0; index < transactionArraySize; index++) {
				sum += transactions[index];
				if (sum >= target) {
					System.out.println("Target achieved after " + (index + 1) + "	transactions ");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved");
			}
		}
	}
}
