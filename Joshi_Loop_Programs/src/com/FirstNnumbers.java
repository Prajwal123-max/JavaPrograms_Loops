package com;

import java.util.Scanner;

public class FirstNnumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num:");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
		}
	}

}
