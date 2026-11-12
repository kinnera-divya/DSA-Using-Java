package com.codegnan.app.javaapp.searchings;

public class FirstOccurance {
	
	public static int firstOccurance(int arr[],int target) {
		

		int low=0;
		int high=arr.length-1;
		
		int firstIndex=-1;
		
		while(low<=high) {
			
			int mid = low + (high-low) / 2;
			
			if(arr[mid]==target) {
				firstIndex=mid;
				high=mid-1;
			}
			
			else if(arr[mid]<target){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return firstIndex;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,2,2,2,3,4};
		
		int target=2;
		
		int FirstOccurance=firstOccurance( arr,target);
		
		System.out.println("first occurence of element:"+FirstOccurance);

	}

}
