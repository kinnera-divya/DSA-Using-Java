package com.codegnan.app.javaapp.array;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {10,20,30,20,40};
		
		boolean found=false;
		
		for(int i=0;i<array.length;i++){
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					System.out.println("duplicate :"+array[j]);
					found=true;
					break;	
			}
		}
			if(found) {
				break;
			}
	}
		if(!found) {
			System.out.println("no duplicate element");
		}

	}

}
