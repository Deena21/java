package com.lti.basics.handson;

import java.util.Scanner;

public class demo9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int maths=sc.nextInt();
		int phy=sc.nextInt();
		int chem=sc.nextInt();
		int total=maths+phy+chem;
		int total1=maths +phy;
		if(maths>=60 && phy>=50 && chem>=20 && total>=200 || total1>=150 )
		System.out.println("is eligible");
		else {
			System.out.println("not eligible");
		}

	}

}
