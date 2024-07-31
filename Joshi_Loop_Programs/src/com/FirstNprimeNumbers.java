package com;

import java.util.Scanner;

public class FirstNprimeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		firstNprimeNUmbers(n);
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
	public static void firstNprimeNUmbers(int n) {
		int count=0;
		int i=1;
		while(count<n) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
	}
}
