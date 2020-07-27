package channel.kothaAbhishek;

public class TryCatch {
	public static void main(String args[]) {

		System.out.println("Before Exception1......");

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (ArithmeticException ae) {
			//predefined msgs
			System.out.println(ae.toString());//exception name and reason
			System.out.println(ae.getMessage());//reason
			ae.printStackTrace(); // exception name,reason, line no, which method it occurs
			//user defined msgs
			System.out.println("b value should be positive number");
		}

		System.out.println("Close Database connection");
	}
}
