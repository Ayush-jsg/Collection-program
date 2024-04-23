package com.m.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one");
		hs.add(null);
		System.out.println(hs);
		hs.remove("three");
		System.out.println(hs);

		Iterator<String> i = hs.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}

}
