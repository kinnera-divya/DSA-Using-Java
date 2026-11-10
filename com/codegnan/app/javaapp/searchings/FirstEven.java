package com.codegnan.app.javaapp.searchings;

public class FirstEven {

	public static void main(String[] args) {
		
		int [] arr= {11,345,23,2345,436,565,676};
		
		for(int num:arr) {
			
			if(num%2==0) {
				
				System.out.println("first even :"+num);
				break;
			}
		}
	}

}
