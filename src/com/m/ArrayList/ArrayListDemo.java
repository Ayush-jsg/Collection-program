package com.m.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add("monu");
		al.add(101);
		al.add(202.05);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add("java");
		System.out.println(al);
	}

}
