package com.java.logic.basic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurence {
	
	public boolean isFrequencyUnique(Integer val[]) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int a:val) {
			if(map.containsKey(a)) {
				map.put(a,map.get(a)+1);
			}else {
				map.put(a,1);
			}
		}
		Set<Integer> s = new HashSet<>(map.values());
		return s.size()==map.values().size();
	}

	public static void main(String[] args) {
		
		Integer a[]= {12,32,43,12,32,32,43,32,43,12,11};
		UniqueNumberOccurence un = new UniqueNumberOccurence();
		System.out.println(un.isFrequencyUnique(a));
		
	}

}
