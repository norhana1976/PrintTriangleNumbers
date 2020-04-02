package com.hana.examples;

public class whileNumberPlayer {

	private int limit;
	public whileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquaresUpToLimit() {
		//1 4 9 16 25 36 49 64 81 
		int i = 1;
		while(i * i<limit) {
			System.out.print(i * i+" ");
			i++;
		}
		System.out.println();
	}
	
	public void printCubesUpToLimit() {
		//1 8 27 64 
		int i = 1;
		while(i * i * i <limit) {
			System.out.print(i * i * i+" ");
			i++;
		}
	}

}
