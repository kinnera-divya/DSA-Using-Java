package com.codegnan.app.javaapp.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Ele {

	public static void main(String[] args) {
		
		int arr[]= {1,1,1,2,2,3,2,3,4,4,5,5};
		int k=2;
		
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int num:arr) {
			
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
		list.sort((a,b)->b.getValue()-a.getValue());
		
		for(int i=0;i<k;i++) {
			System.out.println(list.get(i).getKey());
		}

	}

}
