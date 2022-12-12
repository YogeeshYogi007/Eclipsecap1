package com.lambda.io;

interface sayable{
	public String say(String name);
}
public class One_Parameter {
	public static void main(String[] args) {
		sayable s1= (name)->{
			return "Hello "+name;
		};
		
		System.out.println(s1.say("YOGI"));

	
	sayable s2=(name)->{
		return "Hello "+name;
	};
		System.out.println(s2.say("SWAMY"));
}
	
}
