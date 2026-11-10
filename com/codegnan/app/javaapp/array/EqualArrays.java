package com.codegnan.app.javaapp.array;

public class EqualArrays {

	public static void main(String[] args) {
		
		int[] arra1= {1,2,3,4,5};
		int[] arra2= {1,2,3,4,5};
		
			int[] newarray=new int[arra1.length+arra2.length];
			
			for(int i=0;i<arra1.length;i++) {
				newarray[i]=arra1[i];
			}
			
			for(int i=0;i<arra2.length;i++) {
				newarray[arra1.length+i]=arra2[i];
			}
			
			for(int x:newarray) {
				System.out.println(x+" ");
			}

		boolean equal=true;
		
		if(arra1.length!=arra2.length) {
			equal=false;
			}
			else {
				for(int i=0;i<arra1.length;i++) {
					
				if(arra1[i]!=arra2[i]) {
						equal=false;
					break;
				}
					
			}
		}
		System.out.println("two arrays are equal");

	}

}
