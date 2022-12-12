package com.lambda.io;
interface Sayable{
	public String run(String message);
}
public class Multiple_Statement {
	public static void main(String[] args) {
		
		Sayable ss=(n)->{
			String s1="Hello";
			String s2=s1+ n;
			return s2;
		};
		System.out.println(ss.run(" How are you!"));
	}

}
