package com.codegnan.app.javaapp.searchings;

import java.util.Arrays;
import java.util.List;

public class FindNameInArray {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Pen","paper","pencil","book");
		
		String target="book";
		
		for(int i=0;i<list.size();i++) {
			
			if(list.get(i).equals(target)) {
				
				System.out.println("element found: "+i);
				
				return;
			}
		}
		
		System.out.println("not found....");
	}

}
