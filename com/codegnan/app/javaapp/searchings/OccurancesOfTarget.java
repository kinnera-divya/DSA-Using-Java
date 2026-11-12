package com.codegnan.app.javaapp.searchings;

public class OccurancesOfTarget {
	
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

public static int countOccurance(int[] arr,int target) {
	
	int first=firstOccurance(arr,target);
	
	if(first==-1) {
		
		return 0;
	}
	
	int last=lastOccurance(arr,target);
	return last-first+1;
}



	public static void main(String[] args) {
		
		int[] arr= {1,2,2,2,2,2,2,3,4};
		
		int target=2;
		
		int result=countOccurance(arr,target);
		
		System.out.println("count occurence of target:"+result);

	}

}

