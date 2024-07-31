package com;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num : ");
		int n=s.nextInt();
		
		boolean res=isPrime(n);
		if(res) {
			System.out.println("It is Prime.");
		}else {
			System.out.println("Not Prime.");
		}
	}
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
