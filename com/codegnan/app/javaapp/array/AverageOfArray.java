package com.codegnan.app.javaapp.array;

public class AverageOfArray {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5};
		
		int sum=0;
		double avg=0;
		
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			avg=(double) sum/array.length;
		}
		
		System.out.println("avg of array: "+avg);

	}

}
