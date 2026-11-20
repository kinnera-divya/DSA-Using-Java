package com.codegnan.app.javaapp.collection;

import java.util.HashMap;
import java.util.Map;

public class Non_Repeating_Characters {
public static void main(String[] args) {
	
	String str="Sleeping";
	
	Map<Character,Integer> map=new HashMap<>();
	
	for(char ch:str.toCharArray()) {
		map.put(ch, map.getOrDefault(ch, 0)+1);
	}
	
	for(int i=0;i<str.length();i++) {
		
		if(map.get(str.charAt(i))==1) {
			
			System.out.println("index:"+i);
			return;
		}
	}
	
	System.out.println("none");
	}

}
