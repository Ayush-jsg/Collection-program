package com.m.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {

		Vector<Integer> v = new Vector<>();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(null);

		Enumeration<Integer> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
