package com.codegnan.app.javaapp.searchings;

public class CeilingNumber {
	
	public static int ceilingNumber(int[] arr,int target) {
		
		int low=0;
		int high=arr.length-1;
		
		int ans=-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]>=target) {
				ans=arr[mid];
				high=mid-1;
			}
			else {
				low=mid+1;                                                               
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,8};
		
		int target=7;
		
		int result=ceilingNumber(arr,target);
		
		if(result!=-1) {
			System.out.println("ceiling number:"+result);	
		}
		
		else {
			
			System.out.println("no ceiling number");
			
		}

	}

}
