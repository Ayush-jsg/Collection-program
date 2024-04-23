package com.m.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {

		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(15);
		lhs.add(9);
		lhs.add(null);
		lhs.add(25);

		System.out.println(lhs.size());
		System.out.println("===============================");
		for (Integer e : lhs) {
			System.out.println(e);

		}
		System.out.println("================================");
		Iterator it = lhs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}
}
