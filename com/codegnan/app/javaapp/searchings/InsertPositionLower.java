package com.codegnan.app.javaapp.searchings;

public class InsertPositionLower {
	
	public static int InsertPosition(int[] arr,int target) {
		
		int low=0;
		int high=arr.length-1;
		
		int ans=-1;
		
		while(low<=high) {
			
			int mid=low+(high-low)/2;
			
			if(arr[mid]>=target) {
				ans=mid;
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,6};
		
		int target=5;
		
		int result=InsertPosition(arr,target);
		
		System.out.println("insert position:"+result);	

	}

}
