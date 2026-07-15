package com.example3;

public class Harshad {
	
	public boolean IsHarshad(int num) {
		int sum =0;
		int temp=num;
	for(int i =1; i<=num; i++) {
		int rem=num%10;
		sum+=rem;
		num=num/10;
		
			}
	if(temp%sum==0) {
		return true;
	}return false;

	}
	
	
	
	
	public static void main(String[] args) {
		Harshad H =new Harshad();
		System.out.println(H.IsHarshad(21)?"harshad":"not a harshad");

	}

}
