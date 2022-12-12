package com.lambda.io;

interface sayable1{
	/*
	 * public String say(String name,int age); }
	 */
	public int number(int a,int b);
}
public class Two_parameter {
	public static void main(String[] args) {
/*		sayable1 s1=(name,age)->{
		 return "Hello "+name+" Is your age "+age;	
		};
		System.out.println(s1.say("YOGI", 23));
		*/
		sayable1 s2=(a,b)->(a+b);
		System.out.println(s2.number(2, 4));
	}
}
