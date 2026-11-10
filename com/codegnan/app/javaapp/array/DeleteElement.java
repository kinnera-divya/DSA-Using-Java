package com.codegnan.app.javaapp.array;

import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		
		int arr[]= {1,3,4,6,7};
		int pos=3;
		int newarr[]=new int[arr.length-1];
		
		for(int i=0;i<pos;i++) {
			newarr[i]=arr[i];
		}
		
		for(int i=pos;i<newarr.length;i++) {
			newarr[i]=arr[i+1];
		}
		
		System.out.println("new array ");
		System.out.println(Arrays.toString(newarr));

	}

}
