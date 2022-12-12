package com.lambda.io;

interface drawable{
	public void run();
}
public class Example_with_and_without {
	
	public static void main(String[] args) {
		
	int width=10;
	/*
	drawable draw = new drawable() {
		
		@Override
		public void run() {
			System.out.println("Drawing "+width);
			
		}
	};
	draw.run();
*/
		
		drawable d= ()->{System.out.println("Drawing "+width);};
		d.run();
}
		
}
