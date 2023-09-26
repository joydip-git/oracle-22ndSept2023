import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Throwable {

		// x is the name of the memory block where directly 100 will be stored
		int x = 100;

		// anilPerson, sunilPerson, scanner are name of local variables (memory blocks)
		// where references of Person and Scanner objects will be stored
		Person anilPerson = null;
		Person sunilPerson = null;
		Scanner scanner = null;

		anilPerson = new Person("anil", 1, 1000);
		sunilPerson = new Person("anil", 1, 1000);
		// sunilPerson = anilPerson;

		Person[] people = new Person[] { anilPerson, sunilPerson };

		// if(anilPerson == sunilPerson)
		if (anilPerson.equals(sunilPerson)) {
			System.out.println("same");
		} else
			System.out.println("different");

		System.out.println(anilPerson.toString());

		// automatically toString() will be called, when you try to print a reference
		// variable
		System.out.println(sunilPerson);

		// calling garbage collector explicitly
		// this does not guarantee that the objects of Person class will be destroyed by
		// GC
		// System.gc();
		// sunilPerson.finalize();

		PrintStream printStream = System.out;
		printStream.println(x);

		String str = "Joydip";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}

		System.out.println("press any key to terminate the application");

		InputStream readerStream = System.in;
		scanner = new Scanner(readerStream);
		scanner.next().charAt(0);
		scanner.close();

	}

}
