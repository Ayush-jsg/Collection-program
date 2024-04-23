package com.m.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(27);
		hs.add(20);
		hs.add(null);
		hs.add(9);
		hs.add(25);
		System.out.println(hs.size());
		System.out.println("===============================");
		for (Integer e : hs) {
			System.out.println(e);

		}
		System.out.println("================================");
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
