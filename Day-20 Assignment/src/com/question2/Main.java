package com.question2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<String> citiesName = Stream.of("Delhi", "Mumbai", "Chennai", "Banglore", "Kolkata").collect(Collectors.toList());
		
		System.out.println("Cities : " + citiesName);
		
		List<String> sortedByName = citiesName.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
		
		System.out.println("Sorted by Name : " + sortedByName);
	}

}
