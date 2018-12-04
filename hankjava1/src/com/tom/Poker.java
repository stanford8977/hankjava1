package com.tom;

public class Poker {
	
	int a;
	int b;
    int numb;

	 public Poker(){
		 super();
		 int cards[] = new int[52];
		 for( int i = 0 ; i < 52 ; i ++){
			 
		 }
		 }
	 public void print()
	 {
		 for(int i = 0 ; i < 52 ; i ++){
			 char b = 0;
			 switch(i/13)
			 {
			
				 case 0:
					 b = '\u2660';
				 case 1:
					 b = '\u2663';
					 break;
				 case 2:
					 b = '\u2665';
					 break;
				 case 3:
					 b = '\u2666';
					 break;
			 }
			 System.out.print( i%13+1 + "" + b + " " );
			 
			 if(i%13 == 12)
			 {
				 System.out.println();
			 }
			 
			 
		 }
			 
		 
		 
		 
	 
		 
		 
	 }
	
}
