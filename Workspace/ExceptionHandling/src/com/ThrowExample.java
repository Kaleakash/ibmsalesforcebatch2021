package com;
class AgeException extends Exception {
	public AgeException(String msg) {
		super(msg);				// passing message to Exeption class parameterized construtor , super() it is use to call super class constructor. 
	}
	public AgeException() {
		
	}
}
public class ThrowExample {
	public static void main(String[] args) {
		int age=17;
		try {
		//	int a=10/0;
		if(age>21) {
			System.out.println("Your are elgible to vote....");
		}else {
			//throw new Exception();  // throw generic 
			//throw new ArithmeticException();		// throw specific no message 
			//throw new ArithmeticException("age must be > 21");  // throw pre-defined specific with custom message
			//throw new AgeException();			//throw user-defined exception 
			throw new AgeException("age must be > 21");
		}
		}catch (AgeException e) {
			System.out.println("Exception generated "+e);
		}
	}

}
