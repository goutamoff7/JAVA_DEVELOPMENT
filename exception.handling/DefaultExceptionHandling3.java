//Demonstration for un-handled Exception
public class DefaultExceptionHandling3 {
	public static void main(String[] args) {
		System.out.println("Entering Main method");
		a();
		System.out.println("Exiting Main method");
	}

	public static void a() {
		System.out.println("Entering method a");
		b();
		System.out.println("Exiting method a");
	}

	public static void b() {
		System.out.println("Entering method b");
		System.out.println(10 / 0);
		System.out.println("Exiting method b");
	}

}
