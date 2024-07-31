package com;

import java.util.Scanner;

public class PrimeNumbersBetweenN1andN2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num 1: ");
		int n1=s.nextInt();
		System.out.print("Enter the num 2: ");
		int n2=s.nextInt();
		
		primeBetweenN1andN2(n1, n2);
	}
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void primeBetweenN1andN2(int n1,int n2) {
		for(int i=n1; i<=n2; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
