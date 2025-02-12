package com.recursion;

public class PrintName {
	public static void main(String[] args) {
		name("Syed Umar", 5);
	}
	
	public static void name(String name, int n) {
		if (n <= 0) {
			return;
		}
		
		System.out.println(name);
		n--;
		name(name, n);
	}
}
