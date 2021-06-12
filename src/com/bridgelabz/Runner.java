package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Array elements");
		numberList.show();
		System.out.println();
		int searchResult = numberList.searchByValue(30);
		numberList.addAtIndex(40, searchResult+1);
		numberList.show();
	}
}
