package com.greatlearning.transaction.main;

//import Java Utility Specific Scanner
import java.util.Scanner;
import java.util.Arrays;

//import user defined service
import com.greatlearning.transaction.service.TransactionService;

public class TransactionDriver {
	public static void main(String arg[]) {

		// create a scanner object for getting input for creating Array Variable for
		// Transaction Values
		Scanner sc = new Scanner(System.in);

		//Opening display
		System.out.println("Welcome to PayMoney! Transaction Tracker.");
		System.out.println("");
		
		// display input size requirement
		System.out.println("Enter Transaction Size: ");

		// get the size input
		int tranSize = sc.nextInt();

		// create an array with size
		int tranVal[] = new int[tranSize];

		// get the Transaction Value for the Transaction size defined above
		for (int i = 0; i < tranSize; i++) {
			// display input size requirement
			System.out.println("Enter Transaction Value for Transaction: " + (i + 1) + " : ");
			// assign input value to the array location
			tranVal[i] = sc.nextInt();
		}

		//display of inputed transaction value using Arrays utility
		System.out.println("Transaction Value Inputs are: "+Arrays.toString(tranVal));
		//separator line
		System.out.println("");
		
		// display number of target input requirement
		System.out.println("Enter Number of Targets : ");
		// assign input value to targetNos
		int targetNos = sc.nextInt();

		// create new instance of TransactionService
		TransactionService transactionservice = new TransactionService();

		// pass necessary inputs to checkTransaction in TransactionService
		transactionservice.checkTransaction(tranVal, targetNos);

		//closing display
		System.out.println("");
		System.out.println("Visit again. PayMoney! Transaction Tracker.");
		
		// close the scanner object
		sc.close();

	}// main Class enclosure

} // TransactionDriver Class enclosure