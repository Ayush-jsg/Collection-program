package com.m.ArrayList;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add("Raju");
		al.add("rani");
		al.add(1000.50);
		System.out.println(al);
		System.out.println("size Before Removal:: " + al.size());
		al.remove(0);
		System.out.println("size After Removal:: " + al.size());
		System.out.println(al);

	}

}
