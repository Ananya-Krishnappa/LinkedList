package com.bridgelabz;

public class SortedLinkedList<T extends Comparable<T>> {
	Node<T> head;

	/**
	 * If Linked list is empty then make the node as head and return it. If the
	 * value of the node to be inserted is smaller than the value of the head node,
	 * then insert the node at the start and make it head. In a loop, find the
	 * appropriate node after which the input node (let 9) is to be inserted. To
	 * find the appropriate node start from the head, keep moving until you reach a
	 * node GN (10 in the below diagram) who's value is greater than the input node.
	 * The node just before GN is the appropriate node (7).
	 * 
	 * @param value
	 */
	public void add(T value) {
		Node<T> newNode = new Node<T>();
		newNode.value = value;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			if (value.compareTo(head.value) < 0) {
				newNode.next = head;
				head = newNode;
				return;
			}
			Node<T> currNode = head;
			Node<T> prevNode = head;
			if (null != currNode) {
				while ((null != currNode.next) || (null != currNode.value)) {
					if (value.compareTo(currNode.value) <= 0) {
						prevNode.next = newNode;
						newNode.next = currNode;
						break;
					}
					prevNode = currNode;
					currNode = currNode.next;
					if (currNode == null) {
						break;
					}
				}
			}
			prevNode.next = newNode;
		}
	}

	/**
	 * It is looping through the nodes and printing their values till the last
	 * node's next element is null
	 */
	public void show() {
		Node<T> currNode = head;
		while (currNode.next != null) {
			System.out.println(currNode.value);
			currNode = currNode.next;
		}
		System.out.println(currNode.value);
	}
}
