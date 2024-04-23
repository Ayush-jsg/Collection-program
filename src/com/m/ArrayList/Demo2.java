package com.m.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo2 {

	private static Object listitrator;

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("==========For Loop Approach=========");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));

		}
		System.out.println("========For Each loop Approach=======");

		for (Object obj : al) {
			System.out.println(obj);
		}

		System.out.println("=====Iterator Approach===============");

		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=======List Iterator Approach===============");

		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("==========for Each Approach============");
		al.forEach(i -> {
			System.out.println(i);
		});

	}

}
