package com.day2Prob;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
	     int number=s.nextInt();
		 int reverse=0;
		 int rem;
		 int temp=number;
		for(;temp!=0;)
		{
			rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		}
	if(reverse == number) 
	{
      System.out.println(reverse+ " This is Palindrome number");
    }
	else
	{
		System.out.println(reverse+ " This is not Palindrome number");
	}

}
}