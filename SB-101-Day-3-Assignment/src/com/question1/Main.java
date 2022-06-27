package com.question1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

	   Path p = Paths.get("abc.txt");
       List<String> list= null;
       try {
           list = Files.readAllLines(p);

       System.out.println("Reading from the file");
       for(String line:list) {
           System.out.println(line);
       }
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

	}

}
