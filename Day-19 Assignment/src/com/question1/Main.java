package com.question1;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static HashMap<String, Student> sortByValue(HashMap<String, Student> hm) {

		List<Map.Entry<String, Student>> list = new LinkedList<Map.Entry<String, Student>>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Student>>() {

			public int compare(Map.Entry<String, Student> s1, Map.Entry<String, Student> s2) {

				return (s1.getValue()).compareTo(s2.getValue());
			}
		});

		HashMap<String, Student> result = new LinkedHashMap<String, Student>();
		for (Map.Entry<String, Student> me : list) {
			result.put(me.getKey(), me.getValue());
		}

		return result;
	}

	public static void main(String[] args) {

		HashMap<String, Student> hm = new HashMap<String, Student>();

		hm.put("Maharastra", new Student(10, "Ganesh", 950));
		hm.put("Tamilnadu", new Student(12, "Surya", 850));
		hm.put("Telangana", new Student(15, "Venkat", 920));
		hm.put("Haryana", new Student(16, "Dinesh", 910));
		hm.put("Kerla", new Student(18, "Srinu", 880));

		HashMap<String, Student> hm1 = sortByValue(hm);

		Set<Map.Entry<String, Student>> set = hm1.entrySet();
		for (Map.Entry<String, Student> me : set) {
			System.out.println("Toppers Student of State :" + me.getKey());

			System.out.println("*********************************");
			Student student = me.getValue();
			System.out.println("Roll :" + student.getRoll());
			System.out.println("Name :" + student.getName());
			System.out.println("Marks :" + student.getMarks());
		}

	}
}
