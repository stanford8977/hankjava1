package com.tom;

public class StringTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int n = 100;
	System.out.println(n != 99);
	String s = ("Hello world");
	//          01234567890
	String s2 = new String("Jack Tom Eric");
	//                      0123456789012
	System.out.println(s == s2);
	System.out.println(s.substring(8));
	System.out.println(s.substring(2,7));
	for(int i = s.length()-1; i >=0 ; i--){
		System.out.print(s.charAt(i));
	}
	System.out.println();
	System.out.println(s2.lastIndexOf("c"));
	
	String name = "Tom";
	int index = s2.indexOf(name);
	System.out.println(index);
	System.out.println(s2.substring(0, index) + "boss" + s2.substring(index + name.length()));
	
	String s3 = s2.replace("Tom","Boss");
	System.out.print(s3);
	
	
	

	}
	}
