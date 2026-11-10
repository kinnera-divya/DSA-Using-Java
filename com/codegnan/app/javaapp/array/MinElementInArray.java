package com.codegnan.app.javaapp.array;

public class MinElementInArray {

	public static void main(String[] args) {
		
		int[] array= {2,4,6,78,44};
		
		int min=array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		
		System.out.println("max value in array: "+min);

	}

}
