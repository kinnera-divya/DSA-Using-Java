package com.codegnan.app.javaapp.array;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,1,2,3};//unique element
		
		for(int i=0;i<array.length;i++) {
			
			int count=0;
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println("unique element found: "+array[i]);
				break;
			}
			
		}

	}

}
