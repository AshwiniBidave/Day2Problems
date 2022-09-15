package com.day2Prob;

import java.util.Scanner;

public class ifelseprogram2 {
public static void main(String[] args) {
	System.out.println("Enter a number: ");
	Scanner s = new Scanner(System.in);
int a=s.nextInt();

  if(a==1) {
	  System.out.println("this is unit");
  }
  else if(a==10) {
	  System.out.println("this is tens");
  }
  else if(a==100) {
   System.out.println("this is hundred");

}
  else if(a==1000) {
	  System.out.println("this is thousand");
  }
  else {
	 System.out.println("it is other number"); 
  }
}}