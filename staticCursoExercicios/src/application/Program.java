package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		CurrencyConverter.dollarPrice=sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amount=sc.nextDouble();
		
		System.out.println("Amount to be paid: ");
		CurrencyConverter.Convert(amount);
	}

}
