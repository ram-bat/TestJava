package com.java.program;

import java.util.Scanner;

public class ArmstrongNumber {

	int r,sum=0,i=0,no,t;
	Character c;
	    void armNo(int n){ 
	        t=n; 
	        while(n>0){
	            
	            r=n%10;
	            sum=sum+r*r*r;
	            n=n/10;     
	             }
	            
	             if(sum == t)
	                System.out.println("Given number is Armstrong no");
	             
	             else 
	                 System.out.println("Given number is not armstrong");
	    }
	
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int n=sc.nextInt();
      
      System.out.println("enter the no is :"+n);
      
      ArmstrongNumber a=new ArmstrongNumber();
      
      a.armNo(n);
 
sc.close();

	}

}
