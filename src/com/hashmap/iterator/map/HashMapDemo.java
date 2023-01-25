package com.hashmap.iterator.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("Ram", "Patil");
		map.put("Ajay", "Deshmukh");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key ="+ entry.getKey() +", Value = "+ entry.getValue());
		}
		
		System.out.println("group H");

	}

}
