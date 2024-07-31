package com;

import java.util.Scanner;

public class LCFexcluding1and2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num1:");
		int n=s.nextInt();
		System.out.print("Enter the num2:");
		int m=s.nextInt();
		
		lcfOfBothNumbers(n, m);
	}
	public static void lcfOfBothNumbers(int n,int m) {
		int count=0;
		for(int i=1; i<=n&&i<=m; i++) {
			if(n%i==0 && m%i==0 && i!=1 && i!=2 && count<1) {
				System.out.print(i+" ");
				count++;
			}
		}
	}

}
