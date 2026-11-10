package com.codegnan.app.javaapp.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,1,2,3,3,4};//remove duplicates in array
		
		int arrayunique=0;
		
		for(int i=1;i<array.length;i++) {
			
			if(array[i]!=array[arrayunique]) {
				
				arrayunique++;
				
				array[arrayunique]=array[i];
				
			}
		}
		
		System.out.println("unique elements");
		
		for(int i=0;i<=arrayunique;i++) {
			
			System.out.println(array[i]+" ");
			
		}

	}

}
