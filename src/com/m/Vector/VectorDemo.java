package com.m.Vector;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("sachin");
		v.add(new String("sehwagh"));
		v.add("kohli");
		v.add("rohit");
		v.add("dhoni");
		System.out.println(v);
		System.out.println(v.size());
	}

}
