package com.codegnan.app.javaapp.array;

public class FrequencyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,2,1,3};//frequency array
		
		boolean visited[]=new boolean[array.length];
		
		
		for(int i=0;i<array.length;i++) {
			if(visited[i]) {
				continue;
			}

			int count=1;
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i]==array[j]) {
					count++;
					visited[j]=true;
				}
				
			}
			System.out.println(array[i]+"->"+count);	
	}


	}

}
