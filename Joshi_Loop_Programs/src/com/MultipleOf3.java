package com;

import java.util.Scanner;

public class MultipleOf3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the num: ");
		int n=s.nextInt();
		
		for(int i=1; i<=n; i++) {
			int res=3*i;
			System.out.print(res+" ");
		}
	}

}
