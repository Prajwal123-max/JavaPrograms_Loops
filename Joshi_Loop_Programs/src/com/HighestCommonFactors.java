package com;

import java.util.Scanner;

public class HighestCommonFactors {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int n=s.nextInt();
		System.out.print("Enter the num2: ");
		int m=s.nextInt();
		
		highestCommonFactor(n, m);
	}
	public static void highestCommonFactor(int n,int m) {
		while(m!=0) {
			int temp=m;
			m=n%m;
			n=temp;
		}
		System.out.println(n);
	}

}
