package com.question2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> hm=new LinkedHashMap<>();
		
		hm.put("Andhra Pradesh","Amravati");
		hm.put("Assam","Dispur");
		hm.put("Karnataka","Banglore");
		hm.put("Rajasthan","Jaipur");
		hm.put("Uttar Pradesh","Lucknow");
		
		for(Map.Entry<String, String> me:hm.entrySet()){
			System.out.println(me.getKey()+"======="+me.getValue());
			}
	}
}
