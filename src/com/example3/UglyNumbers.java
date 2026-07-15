package com.example3;

public class UglyNumbers {
	public boolean isugly(int num)
	{
		if( num%2==0  || num%3==0 || num%5==0){
		return true;
		

	}
	return false;
}

	

	public static void main(String[] args) {
UglyNumbers obj= new UglyNumbers();

System.out.println(obj.isugly(10)? "ugly number" : "! ugly number");
	
}

}

