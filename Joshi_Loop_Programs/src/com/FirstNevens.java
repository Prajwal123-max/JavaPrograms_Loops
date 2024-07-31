package com;

import java.util.Scanner;

public class FirstNevens {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		for(int i=2; i<=n; i=i+2) {
			System.out.print(i+" ");
		}
	}

}
