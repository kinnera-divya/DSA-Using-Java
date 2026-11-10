package com.codegnan.app.javaapp.searchings;

public class LinearSearchString {

	public static void main(String[] args) {
		
		String[] names={"Divya","Priya","Janu","Prabha"};
		
		String target="Divya";
		
		boolean found=false;
		
		for(String name:names) {
			
			if(name.equals(target)) {
				
				found=true;
				
				break;
			}
		}
		
		System.out.println(found ?"present ":"absent");
	}

}
