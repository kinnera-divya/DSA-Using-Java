package com.codegnan.app.javaapp.array;

public class LeftShiftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,30,40,50};//left shift rotation two times
		
		int k=2;
		
		for(int r=1;r<=k;r++) {
			
			int first=array[0];
			
			for(int i=0;i<array.length-1;i++) {
				
				array[i]=array[i+1];
				
			}
			
			array[array.length-1]=first;
		}
		
		for(int x:array) {
			System.out.println(x+" ");
		}
		

	}

}
