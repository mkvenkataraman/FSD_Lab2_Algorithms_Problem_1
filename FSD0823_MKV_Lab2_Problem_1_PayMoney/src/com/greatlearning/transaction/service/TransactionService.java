package com.greatlearning.transaction.service;

//import java utility scanner
import java.util.Scanner;

public class TransactionService {

	// checkTransaction method with parameters tranVal and targetNos
	public void checkTransaction(int[] tranVal, int targetNos) {

		//Initialize scanner for getting integer input
		Scanner sc = new Scanner(System.in);

		//Implementation of while look for targetNos
		while (targetNos-- != 0) {

			//Initialize variables
			int flag = 0; //for look break
			int target; //for storing Target Value

			//input target value
			System.out.println("Enter Target Value for "+ (targetNos+1) + " :");
			target = sc.nextInt();

			//Initialize variable for sum of transaction value
			int sumTran = 0;
			
			for (int i = 0; i < tranVal.length; i++) { // linear iteration , linear searching

				sumTran += tranVal[i];

				if (sumTran >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions.");
					flag = 1;
					break;
				}
			}

			if (flag == 0) {
				System.out.println("Given target is not achieved. ");
			}
		}

		// close scanner
		sc.close();

	} // closure for checkTransaction method

} // closure for Transaction Service