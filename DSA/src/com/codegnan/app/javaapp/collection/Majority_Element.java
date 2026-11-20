package com.codegnan.app.javaapp.collection;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

	public static void main(String[] args) {
		
		int[] arr= {3,3,1,1,3,3,3};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(int key:map.keySet()) {
			
			if(map.get(key)>arr.length/2) {
				
				System.out.println("Majority:"+key);
			}
		}

	}

}
