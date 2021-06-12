package com.bridgelabz;

public class SortedLinkedListRunner {
	public static void main(String[] args) {
		SortedLinkedList<Integer> numberList = new SortedLinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(40);
		numberList.add(100);
		numberList.add(70);
		numberList.add(10);
		numberList.add(5);
		System.out.println("Array elements");
		numberList.show();

	}

}
