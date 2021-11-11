package com.lti.basics.handson;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		float a= sc.nextFloat();
		float b= sc.nextFloat();
		float c=0;
		for (float d=a;a<=b;a++) {
			c=(1/a)+c;
		}
		System.out.println(c);
		
	}

}
