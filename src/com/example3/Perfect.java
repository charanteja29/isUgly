package com.example3;

public class Perfect {
	 public boolean perfect(int num) {
		 int sum =0;
		 for(int i =1;i<=num/2;i++) {
			 if(num%i==0) {
			 sum+=i;
			 }
			 
				
			 }if(num==sum) {
				 return true;
			 }
			return false;
		 }
		 
	public static void main(String[] args) {
		Perfect p = new Perfect() ;
		System.out.println(p.perfect(18)?"perfect":"not perfect");
			
		}

	}

