package channel.kothaAbhishek;
import java.util.Scanner;

//create the new exception class extends Exception or RuntimeException
//create a public constructor for a new class with String type of parameter 
//pass the string parameter to the super class
//declare the exception at method level(throws)
//create try block inside that create a new exception and throw it based on some condition 
//write a catch block and use some predefined exceptions
public class CustomException extends Exception{
	
	public CustomException(String msg) {
		super(msg);
	}
	//custom
	public static void main(String args[]) throws CustomException {
		try {
			System.out.println("Enter your age");
			Scanner s = new Scanner(System.in);
			int age = s.nextInt();
			if(age<18)
				throw new CustomException("you are not eligible for Vote");
			else
				System.out.println("you are eligible for vote");
		}catch(CustomException c) {
			c.printStackTrace();
		}
	}
}

