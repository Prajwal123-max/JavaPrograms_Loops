package com;

import java.util.Scanner;

public class CountFactors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		countFactorsOfGivenNum(n);
	}
	public static void countFactorsOfGivenNum(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("count of Factors of given num: "+count);
	}

}
