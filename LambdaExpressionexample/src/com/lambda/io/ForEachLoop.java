package com.lambda.io;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("Yogeesh");
		list.add("Swamy");
		list.add("Hanuman");
		list.add("Shan");
		list.add("gowda");
		list.add("Beast");
		list.add("Sam");
		
		list.forEach(
				(n)->{
					System.out.println(n);
				}
				
				);
	}

}
