package com.day2Prob;

import java.util.Scanner;

public class reverseUsingFor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
	     int number=s.nextInt();
		 int reverse=0;
		 int rem;
		for(;number!=0;) {
			rem=number%10;
			reverse=reverse*10+rem;
			number=number/10;
		}
System.out.println(" reverse number is "+reverse);

	}

}
