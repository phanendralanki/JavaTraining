package com.methods;

public class MethodErrors {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		//Main Method:
		//1.main method should be public -> main method not found
		//2.main method should be definitely of type static
		//3. main method return type should be void
		//4. if change main to mainOne then it throws main method not found 
		//5. if remove String[] args then main method not found
		//6. if we change String[] args to int then -> main method not found
		
		float a = 5,b=6;
		System.out.println(sum(a,b));
		
		
	}
	public static float sum(float a, float b) {
		return a+b;
	}
	
//	Data type conversions lower to higher is possible ex: int->float->double->long
	// but Higher sized to  size is not possible ex: long->double->float->int
}
