package com.codegnan.app.javaapp.array;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,1,2,2,1,1,1};//majority element
		
		int majority=-1;
		
		for(int i=0;i<array.length;i++) {
			
			int count=0;
			
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			
			if(count>(array.length/2)) {
				
				majority=array[i];
				break;
			}
		}
		System.out.println("majority of element :"+majority);

	}

}
