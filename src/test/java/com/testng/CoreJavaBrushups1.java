package com.testng;

public class CoreJavaBrushups1 {

	public static void main(String[] args) {
		
		int num=5;
		String website="Rahul Shetty Academy";
		char letter= 'r';
		double dec= 5.99;
		boolean mycard= true;
		
		
		System.out.println(num +" is the value stored in num variable");
		System.out.println(website);
		System.out.println(dec);
		System.out.println(mycard);
		
	//---------------------------------------------------------------------------------------------------------------	
		//Arrays........array can declare in 2 ways
		//1. int arr[]= {8,3,4,5,2};
		
		//2
		int arr[]= new int[5];
		
		
		arr[0]= 8;
		arr[1]= 3;
		arr[2]= 4;
		arr[3]= 5;
		arr[4]= 2;
		
		System.out.println(arr[2]);
		
		// arr.length=5
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	//------------------------------------------------------------------------------------------------------------------	
		//1.
		String[] name= {"Sonali", "Mane", "Selenium"};
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		
		//2.
		for(String s: name)
		{
			System.out.println(s);
		}
		
		

	}

}
