package com.codegnan.app.javaapp.searchings;

public class BinarySearchString {

	public static void main(String[] args) {
		
		String names[]= {"avathar","bahubali","cackcol","durandar","eveldead"};
		
		String target="eveldead";
		
		int low=0;
		
		int high=names.length-1;
		
		
		while(low<=high) {
			
			int mid=(low+high)/2;
			
			int cmp=names[mid].compareTo(target);
			
			if(cmp==0) {
				
				System.out.println("found at :"+mid);
				return;
			}
			
			else if(cmp>0) {
				high=mid-1;
				
			}
			
			else {
				low=mid+1;
				
			}
		}
		System.out.println("not found...");

	}

}
