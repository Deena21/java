package com.lti.basics.handson;



public class demo11 {
	public static void main(String[] args) {
		int a=2;
		int b=0;
		
		while (b!=5) {
			boolean flag=true;
		for(int i=2;i<a;i++) {
			
	        int c=a%i;
			if (c==0) {
				flag=false;
				System.out.println( a +  " is not prime ");
				break;
			}
		}
		if(flag==true){
		b++;
		double c=(double)Math.cbrt(a);
		System.out.println(c);
		}
		a++;
	}
	}}			
			
		
		

	


