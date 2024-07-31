package com;

import java.util.Scanner;

public class MultiplesOf2And3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
		}
	}

}
