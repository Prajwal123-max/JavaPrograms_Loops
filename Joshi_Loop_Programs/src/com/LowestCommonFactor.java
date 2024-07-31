package com;

import java.util.Scanner;

public class LowestCommonFactor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int n=s.nextInt();
		System.out.print("Enter the num2: ");
		int m=s.nextInt();
		
		lowestCommonFactor(n, m);
	}
	public static void lowestCommonFactor(int n,int m) {
		int count=0;
		for(int i=1; i<=n&&i<=m; i++) {
			if(n%i==0 && m%i==0 && count<1) {
				System.out.print(i+" ");
				count++;
			}
		}
	}

}
