package com.lambda.io;
interface Fighting{
	void run();
}

public class N0_parameter_argumentList {
	public static void main(String[] args) {

	int body=2;
	Fighting f = ()->{
		System.out.println(body);
	};
	
	f.run();
}		
}
