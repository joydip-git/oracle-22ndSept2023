
public class App {

	public static void main(String[] args) {
		Sample sampleObjectRef = new Sample();
		// printMessage(sample);

		// call printMessage and pass the method sayHi/sayBye as an argument
		// i.e. reference to a method => method reference
		// callback mechanism => passing a method as an argument to another method
		// so that the from another method we can call the first method back

		// a functional interface is used to store reference to a method, whose
		// signature, i.e., return type and arguments (type, number and position)
		// matches to the signature of the method in the functional interface

		// declare a reference variable of the functional interface and then assign a
		// method name with reference variable of the class (if it is an instance
		// method) using scope resolution
		// operator (::)
		Invoker refTosayHi = sampleObjectRef::sayHi;
		printMessage(refTosayHi, "anil");

		// declare a reference variable of the functional interface and then assign a
		// method name with class name (if it is s static method) using scope resolution
		// operator (::)
		Invoker refTosayBye = Sample::sayBye;
		printMessage(refTosayBye, "sunil");

		/*Invoker i = sampleObjectRef::exit;
		Invoker i1 = sampleObjectRef::exitAgain;*/
	}

	static void printMessage(Invoker refToMethod, String name) {
		String message = refToMethod.invoke(name);
		System.out.println(message);
	}
}
