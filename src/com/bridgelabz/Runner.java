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
		int searchResult = numberList.searchByValue(90);
		String result = (searchResult == -1) ? "value not found in the list" : "value found at index " + searchResult;
		System.out.println(result);
	}
}
