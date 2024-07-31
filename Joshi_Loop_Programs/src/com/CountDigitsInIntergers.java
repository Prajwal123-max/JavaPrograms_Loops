package com;

import java.util.Scanner;

public class CountDigitsInIntergers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		countDigitsOfnumbers(n);
	}
	public static void countDigitsOfnumbers(int n) {
		int count=0;
		while(n!=0) {
			int digit=n%10;
			count++;
			n=n/10;
		}
		System.out.println("Count of digits in this numbers is: "+count);
	}

}
