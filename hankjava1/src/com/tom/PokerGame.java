package com.tom;

import java.util.Random;



public class PokerGame {

	public static void main(String[] args) {
	
	 /*Random random = new Random();	
     int a = random.nextInt(13)+1;
	 int b = random.nextInt(4)+1;
	 
	  
	 
	 
	 if(b == 1)
	 {
		 System.out.println( a + "S" );
	 }
	 if(b == 2)
	 {
		 System.out.println( a + "H" );
	 }
	 if(b == 3)
	 {
		 System.out.println( a + "D" );
	 }
	 if(b == 4)
	 {
		 System.out.println( a + "C" );
	 }*/
		
		int n = 4;
		int[] nn = new int[52];
		
		Card c = new Card(5);
		Card[] cards = new Card[52];
		
		Poker poker = new Poker();
		poker.print();
		
		/*String a="\u2660";
		String b="\u2663";
		String c="\u2665";
		String d="\u2666";
		int[] x = new int[14];
		x[1] = 1;
		x[2] = 2;
		x[3] = 3;
		x[4] = 4;
		x[5] = 5;
		x[6] = 6;
		x[7] = 7;
		x[8] = 8;
		x[9] = 9;
		x[10] = 10;
		x[11] = 11;
		x[12] = 12;
		x[13] = 13;
		
		
	    for(int i = 0 ; i < x.length ; i++)
	    {
	        System.out.println(x[i] + a + x[i] + b + x[i] + c + x[i] + d);
	        
	    }
	 
     int[] nums = new int[8];
     nums[1]  = 1;
     nums[2]  = 2;
     nums[3]  = 3;
     System.out.println(nums[1] + "\t" + nums[4] + "\t"  + nums[6]);
     System.out.println(nums.length);
     for(int i = 0 ; i < nums.length ; i++)
     {
    	 System.out.println(nums[i]);
     }
		
	 Random random = new Random();
	 for(int i = 0 ; i < 52 ; i++)
	 {
		 int a = random.nextInt(13)+1;
		 int b = random.nextInt(4)+1;
		 switch(b)
		 {
			 case 1:
				 //System.out.println(a + "S");
				 break;
			 case 2:
				 //System.out.println(a + "H");
				 break;
			 case 3:
				 //System.out.println(a + "D");
				 break;
			 case 4:
				 //System.out.println(a + "C");
				 break;
		 }
	 }*/
			        }
			  

	}


