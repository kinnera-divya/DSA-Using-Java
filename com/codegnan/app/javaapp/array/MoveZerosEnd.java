package com.codegnan.app.javaapp.array;

public class MoveZerosEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,0,3,0,4,5,6};//move zeros at the end
		
		int index=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]!=0) {
				array[index]=array[i];
				index++;
			}
			
		}
		while(index<array.length) {
			array[index]=0;
			index++;
		}
		for(int x:array) {
			System.out.println(x+" ");
		}

	}

}
