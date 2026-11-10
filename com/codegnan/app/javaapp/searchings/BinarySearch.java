package com.codegnan.app.javaapp.searchings;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70};
		
		int target=60;
		
		int low=0;
		
		int high=arr.length-1;
		
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			if(arr[mid]==target) {
				
				System.out.println("found at :"+mid);
				return;
			}
			
			else if(arr[mid]>target) {
				high=mid-1;
				
			}
			
			else {
				low=mid+1;
				
			}
		}
		System.out.println("not found...");
	}
}
