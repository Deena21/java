package com.lti.basics.handson;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
	
		while (a!=0) {
			int d=a;
			int b=a%10;
			int c=0;
		  c=(c*10)+b;
		     a=a/10;
		     System.out.print(c);
		  
			
			
		}

	}

}
