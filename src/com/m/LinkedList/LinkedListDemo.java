package com.m.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("Ashok");
		ll.add(40);
		ll.add(null);
		System.out.println(ll);
		ll.add(0, "java");
		System.out.println(ll);
		ll.add(0, "oracle");
		System.out.println(ll);
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst("|Ashok");
		System.out.println(ll);
	}

}
