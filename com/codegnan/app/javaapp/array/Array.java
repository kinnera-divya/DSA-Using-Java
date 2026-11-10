package com.codegnan.app.javaapp.array;

public class Array {
	public static void main(String[] args) {
		int[] array;
		System.out.println("array declared");
		
		int[] arr1=new int[6];
		System.out.println("length: "+arr1.length);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i);
		}
		
		
		int[] arr2={1,2,3,4,5,6,7};
		
		for(int i=0;i<arr2.length;i++) {
			System.out.println(i+" = "+arr2[i]);
		}
		
	}
}
