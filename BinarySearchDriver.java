package com;

public class BinarySearchDriver {

	public static void main(String args[]){
		int [] numbers = {1,5,10,22,30,50};
		BinarySearch bs=new BinarySearch();
		bs.search(numbers,5,0,numbers.length);
		
		
	}
}
