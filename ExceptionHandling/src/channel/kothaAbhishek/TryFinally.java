package channel.kothaAbhishek;

public class TryFinally {
	public static void main(String args[]) {

		System.out.println("Before Exception1......");

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} finally {
			System.out.println("Finally block");
		}

		System.out.println("Close Database connection");
	}
}
