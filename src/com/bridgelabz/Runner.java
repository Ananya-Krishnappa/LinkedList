package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(70);
		numberList.addAtIndex(30, 1);
		numberList.show();
	}
}
