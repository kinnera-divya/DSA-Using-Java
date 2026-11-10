package com.codegnan.app.javaapp.array;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {0,2,1,4};//missing element
		
		int n=array.length;
		int expected=0;
		
		for(int i=0;i<=n;i++) {
			expected=expected+i;
			
		}
		
		int actual=0;
		for(int x:array) {
			actual=actual+x;
		}
		
		int missing=expected-actual;
		System.out.println("missing element: "+missing);

	}

}
