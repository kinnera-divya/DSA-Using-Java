package com.codegnan.app.javaapp.array;

public class MaxElementInArray {

	public static void main(String[] args) {
		
		int[] array= {2,4,6,78,44};
		
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println("max value in array: "+max);

	}

}
