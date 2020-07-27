package channel.kothaAbhishek;

//used to explicitly throw an Exception from a method or any block of code
//mainly used to throw custom exceptions
//we can define our own set of conditons or rules and throw an exception explicitly using throw keyword
public class Throw {

	public static void main(String args[]) {
		validate(17);
		System.out.println("Main method");
	}

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("You are not eligible for vote");
		} else {
			System.out.println("You are eligible for vote");
		}
	}
}
