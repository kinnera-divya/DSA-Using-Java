package com.codegnan.app.javaapp.array;

public class InsertionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};//insertion elements 
		
		int[] b= {1,4,23,2,5};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					System.out.println(a[i]);
				}
			}
		}
	}

}
