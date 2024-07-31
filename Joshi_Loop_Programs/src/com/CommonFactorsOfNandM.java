package com;

import java.util.Scanner;

public class CommonFactorsOfNandM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int n=s.nextInt();
		System.out.print("Enter the num2: ");
		int m=s.nextInt();
		
		commonFactorsOfnAndm(n, m);
	}
	public static void commonFactorsOfnAndm(int n,int m) {
		int smallNum=(m<n)?m:n;
		for(int i=1; i<=smallNum; i++) {
			if(n%i==0 && m%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
