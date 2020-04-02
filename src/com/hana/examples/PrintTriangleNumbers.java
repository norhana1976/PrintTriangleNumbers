package com.hana.examples;

public class PrintTriangleNumbers {

	public static void main(String[] args) {
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5 
		
		for(int number = 1; number <=5; number++) {
			for(int i = 1; i<=number; i++) {
				System.out.print(i +" ");
			}
			System.out.println("");
		}
	}
}
