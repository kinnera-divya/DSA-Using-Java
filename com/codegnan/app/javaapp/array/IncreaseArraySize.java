package com.codegnan.app.javaapp.array;

import java.util.Arrays;

public class IncreaseArraySize {

	public static void main(String[] args) {
		
		int[] arr= {20,30,50,44};
		
		int pos=2;
		int val=40;
		
		int[] newarray=new int[arr.length+1];
		
		for(int i=0;i<pos;i++) {
			newarray[i]=arr[i];//0,1,2
		}
		newarray[pos]=val;
		
		for(int i=pos;i<arr.length;i++) {
			newarray[i+1]=arr[i];
		}
		
		System.out.println("new array ");
		System.out.println(Arrays.toString(newarray));	
	
	}
}