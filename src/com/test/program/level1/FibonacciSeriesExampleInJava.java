package com.test.program.level1;
public class FibonacciSeriesExampleInJava {
 
    public static void main(String[] args) {
           
           int n=10;  //number of elements in series.
           generateFibonacciSeries(n);
    }
    
    public static void generateFibonacciSeries(int n){
          /* int first=0;  //first number of series
           int second=1; //second number of series
           int temp;
           
           System.out.print("FibonacciSeries: "+ first+" "+second+" ");
           for(int i=0;i<n;i++){
                  temp=first+second;
                  first=second;
                  second=temp;            
                  System.out.print(temp+" ");
           }*/
    	
    	int s =0;
    	int a=0;
    	int b=1;
    	System.out.println(s);
    	for (int i=0; i<n; i++) {
    		s=a+b;
    		a=b;
    		b=s;
    		System.out.println(s);
    	}
    }
    
 
}