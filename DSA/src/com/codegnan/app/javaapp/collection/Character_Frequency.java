package com.codegnan.app.javaapp.collection;

import java.util.HashMap;
import java.util.Map;

public class Character_Frequency {

	public static void main(String[] args) {
		
		String s="Sleeping";
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char ch:s.toCharArray()) {
			
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			
			char ch=s.charAt(i);
			
            if (map.containsKey(ch)) {
            	
                System.out.println(ch + " : " + map.get(ch));
                
                map.remove(ch); 
            }
			
		}

	}

}
