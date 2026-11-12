package com.codegnan.app.javaapp.searchings;

public class LastOccurance {
	
	public static int lastOccurance(int arr[],int target) {
		
		int low=0;
		int high=arr.length-1;
		
		int LastIndex=-1;
		
		while(low<=high) {
			
			int mid = low + (high-low) / 2;
			
			if(arr[mid]==target) {
				LastIndex=mid;
				low=mid+1;
			}
			
			else if(arr[mid]<target){
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return LastIndex;
		
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,2,2,2,3,4};
		
		int target=2;
		
		int LastOccurance=lastOccurance(arr,target);
		System.out.println("last occurence of element:"+LastOccurance);

	}

}
