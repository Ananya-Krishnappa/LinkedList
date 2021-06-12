package com.bridgelabz;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.add(56);
		numberList.add(30);
		numberList.add(70);
		System.out.println("Array before popLast");
		numberList.show();
		System.out.println();
		numberList.popLast();
		System.out.println("Array after popLast");
		numberList.show();
	}
}
