package com.lambda.io;
interface addition{
	public int add(int a,int b);
}
public class With_and_without_Keyword {
	public static void main(String[] args) {
		//without using return statement
		addition a1=(a,b)->(a+b);
		System.out.println(a1.add(2, 6));
	
		//with using return statement
		
	addition a2=(a,b)->{
			return (a+b);
	};
	System.out.println(a2.add(2, 6));
	
}
}
