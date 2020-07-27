package channel.kothaAbhishek;

public class NestedTry {
	public static void main(String args[]) {

		try {
			int a[] = { 22, 3 };
			try {
				a[3] = 3 / 0;
			} catch (ArithmeticException ae) {
				System.out.println("-----ArithmeticException-------");
			}
			a[2] = 5;
		} catch (ArrayIndexOutOfBoundsException aa) {
			System.out.println("-----ArrayIndexOutOfBoundsException-------");
		}
	}
}
