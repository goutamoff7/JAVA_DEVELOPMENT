package exceptionHandling;
class Exception_nested_try_catch_case12 {
	public static void main(String[] args) {
		System.out.println("Enter main method");
		try {
			System.out.println("Enter outer try block");
			// System.out.println(10 / 0);
			System.out.println("Hello outer try");
			try {
				System.out.println("Enter inner try block");
				// System.out.println(10 / 0);
				System.out.println("Hello inner try");

			} catch (ArithmeticException e) {
				System.out.println("Divide by Zero Exception in inner try");
			} finally {
				System.out.println("Exit inner finally");
			}
			System.out.println(20 / 0);
		} catch (Error e) {
			System.out.println("Divide by Zero Exception in outer try");

		} finally {
			System.out.println("Exit outer finally ");
		}
		System.out.println("Exit main method");
	}

}