package com;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		sumOfDigitsOfNumbers(n);
	}
	public static void sumOfDigitsOfNumbers(int n) {
		int sum=0;
		while(n!=0) {
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println("Sum of digits of given numbers is: "+sum);
	}

}
