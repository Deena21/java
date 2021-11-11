package com.lti.basics.handson;

import java.util.Scanner;

public class demo12 {

	public static void main(String[] args) {
//		Write a program to display duplicates from a given array
		int [] [] a=new int [3] [3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				Scanner sc=new Scanner (System.in);
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
		
	}

}
