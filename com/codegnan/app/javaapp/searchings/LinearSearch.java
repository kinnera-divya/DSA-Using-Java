package com.codegnan.app.javaapp.searchings;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] arr= {20,10,30,50,34,32};
		
		int target=32;
		
		int index=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(target==arr[i]) {
				
				index=i;
				break;
			}

		}
		
		System.out.println(index!=-1?"found at: "+index:"not found");
	}

}
