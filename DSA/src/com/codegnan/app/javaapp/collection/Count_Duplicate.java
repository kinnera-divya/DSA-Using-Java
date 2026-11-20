package com.codegnan.app.javaapp.collection;

import java.util.HashMap;
import java.util.Map;

public class Count_Duplicate {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,20,20,40,50,50,40,20,50};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey()+" "+entry.getValue()+" times");
			}
		}

	}

}
