package channel.kothaAbhishek;

//used in the signature of method to indicate that this method might throw one of the listed type exceptions 
//the caller to these methods has to handle the exception by using try-catch
//it is designed to transfer the responsibility of exception handling to its caller
//only for checked exceptions
public class Throws {

	public static void main(String args[]) {
		try {
			display();
		} catch (ArithmeticException aa) {
			aa.printStackTrace();
		}
		System.out.println("Main method");
	}

	public static void display() throws ArithmeticException,ArrayIndexOutOfBoundsException {
		int a = 3 / 0;
		System.out.println(a);
	}
}
