package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(70);
		System.out.println("Array elements");
		numberList.show();
		System.out.println();
		int searchResult = numberList.searchByValue(40);
		numberList.popAtIndex(searchResult);
		numberList.show();
		System.out.println("The size of the list is " + numberList.size());
	}
}
