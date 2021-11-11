package com.lti.basics.handson;

public class demo13 {

	public static void main(String[] args) {
		int [] a= {1,2,3,2,2,1};
		for(int i=0;i<a.length/2;i++) {
		//	System.out.println(a.length);
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]) {
					System.out.println("the repeated values are" + a[i]);
				}
			}
		}
		
		

	}

}
