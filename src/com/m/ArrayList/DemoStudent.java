package com.m.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoStudent {
	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		
		
		al.add(new Student(1, "raju"));
		al.add(new Student(2, "rani"));
		al.add(new Student(3, "smith"));
		al.add(new Student(4, "john"));

		ListIterator<Student> li = al.listIterator();
		
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		System.out.println("==============================");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
