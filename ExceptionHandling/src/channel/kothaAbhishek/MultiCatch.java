package channel.kothaAbhishek;

//a[3] = 3/0;  in this first 3/0 will execute first the after the value is assigned to a[3]

public class MultiCatch {
	public static void main(String args[]) {

		try {
			int a[] = { 22, 3 };
			a[2] = 3;//ArrayIndexOutOfBoundsException
			a[3] = 3/0;//ArithmeticException 
			a[3] = 3/1;//ArrayIndexOutOfBoundsException
		}/*catch (Exceprion ae) {
			System.out.println("-----ArithmeticException-------");
		}*/ catch (ArithmeticException ae) {
			System.out.println("-----ArithmeticException-------");
		} catch (NullPointerException npe) {
			System.out.println("-----NullPointerException-------");
		} catch (ArrayIndexOutOfBoundsException aa) {
			System.out.println("-----ArrayIndexOutOfBoundsException-------");
		}catch (Exception e) {
			System.out.println("-----Exception-------");
		}//we should write Exception class as last bcoz if we write this as first child exception classes not execute
	}
}


