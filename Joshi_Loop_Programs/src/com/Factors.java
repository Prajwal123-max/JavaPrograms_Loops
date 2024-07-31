package com;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		factorsOfGivenNumbers(n);
	}
	public static void factorsOfGivenNumbers(int n) {
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
