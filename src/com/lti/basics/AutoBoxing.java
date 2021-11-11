package com.lti.basics;

public class AutoBoxing {

	public static void main(String[] args) {
		int a=10;
		Integer b= Integer.valueOf(a);
		Integer c=a;
		System.out.println("Datatype="+ a);
		System.out.println("object 1=" + b);
		System.out.println("object 2=" + c);

	}

}
