package com.test.program.level1;
public class SumOfDigitsInNumberExample {
    public static void main(String...args){
           
           int number=1234;  
           
           System.out.println("number     : "+number);
           System.out.println("sum of digits : "+sumOfDigits(number));
    }
    
    public static int sumOfDigits(int number){
          /* int sum=0;
           int remainder;
           
           while(number>0){
                  remainder=number%10;
                  number=number/10;
                  sum+=remainder;
           }          
           return sum;*/
    	
    	int s=0;
    	while(number>0) {
    		int r=number%10;
    		s=s+r;
    		number = number/10;
    	}
    	return s;
    }
}