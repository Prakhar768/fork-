package day4_nestedLoop_Strings;
//String is collection of character -- alpha numeric
//String is in java.lang.String
// its immutable - value cannot be changed
//java.lang.* -- default package -- no need to write 

import  java.lang.*;

public class StringExample1 {

	public static void main(String[] args) {
		 
		String a="Hello";
		String b="Hello";
		
		System.out.println(a==b);//true --> address
		System.out.println(a.equals(b));//true value 
		
		//strings are immutable - cannot change 
		a="java";
		
		//2 method 
		String x= new String("T0ST");
		String y= new String("test");
		
		System.out.println(x==y);//false  // compare address of x and y where they are pointing 
		System.out.println(x.equals(y));//false //compare value of x and y 

		System.out.println(x.equalsIgnoreCase(y));//true
		 
		
		System.out.println(x.charAt(3));//T 
		//System.out.println(x.charAt(4));//exception -- runtime error 
		
		System.out.println(x.length());//4 
		System.out.println(x.replace('0', 'e'));
		
		
		//=================concatenation==================
		
		
		String k="Welcome";
		
		//k= k+" java";
		
		k +="java";
		
		//========= substring (extract portion of string 
		
		String q="welcome";
		
		System.out.println(q.substring(3)); //starting from 3rd position till  last ->come
		
		System.out.println(q.substring(3,4));// co
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

