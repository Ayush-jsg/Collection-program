package com.m.Stack;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {

		Stack<Double> s = new Stack<>();

		s.push(10.2);
		s.push(20.3);
		s.push(30.4);
		s.push(40.5);
		s.push(50.6);
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
	}

}
