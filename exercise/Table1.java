package com.rays.exercise;

public class Table1 {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int a = i * j;
				System.out.println(a +"\t");
			}
			System.out.println();
		}
	}
}
