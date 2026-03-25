package com.testng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		
		
	int arr[]= {1,2,4,5,6,7,8,9,144};
	
	for(int i=0; i<arr.length; i++)
	{
		
		if(arr[i]%2==0)
		{
			
			System.out.println(arr[i]);
			//break;
			
		}
		else
		{
			
			System.out.println(arr[i] + " is not multile of 2");
		}
	}

		
	
	
//---------------------------------------------------------------------------------------------------------------
	
	ArrayList<String> a= new ArrayList<String>();
	
	a.add("Sonali");
	a.add("Mane");
	a.add("Academy");
	a.add("Selenium");
	System.out.println(a.get(3));
	
	for(int i=0; i<a.size(); i++)
	{
		
		System.out.println(a.get(i));
	}
	
	System.out.println("*****************");
	
	
	for(String value:a)
	{
		System.out.println(value);
	}
	
	
	
//	----------------------------------------------------------------------------------------------------------------------
	
	//Item is present in ArrayList
	
	System.out.println(a.contains("Selenium"));
	
	
	System.out.println("*****************");
	
	
	//convert array to arraylist
	String[] name= {"Sonali", "Mane", "Selenium"};
	ArrayList<String> al= new ArrayList<String>(Arrays.asList(name));
	//List<String> nameArrayList =Arrays.asList(name);
	//al.contains(al);
	System.out.println(al);
	
}
}

