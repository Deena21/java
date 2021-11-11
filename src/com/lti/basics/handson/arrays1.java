package com.lti.basics.handson;

import java.util.Scanner;

public class arrays1 {

	public static void main(String[] args) {
		int [] a={1,2,3,4,5};
		int [] b = new int [5];
		
		//Scanner sc=new Scanner (System.in);
		
		for (int i=0;i<5;i++) {
			System.out.print(a[i] + " ");
			b[i]=a[i];
		}
		System.out.println();
		System.out.println("after copying the values from a[] to b[]");
		for (int i=0;i<5;i++) {
			System.out.print(b[i] + " ");
		}
	}

}
