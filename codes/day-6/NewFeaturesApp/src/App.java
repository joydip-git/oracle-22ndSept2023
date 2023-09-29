
public class App {

	public static void main(String[] args) {

		// the reference variable of the functional interface, Invoker, can be used to
		// store reference of any method, whose signature is same as that of the
		// interface method, invoke
		// signature of method:
		// a. number of arguments in the method
		// b. position of the arguments in the method
		// c. data type of the arguments in the method
		// 4. return type of the method

		// the name of the method acts as reference to the method

		// A. if the method is instance, create an object of the class
		// with the reference variable mention the name of the method with scope
		// resolution operator (::)
		Implementation implementationObjectReference = new Implementation();
		Invoker welcomeMethodInvoker = implementationObjectReference::getWelcomeMessage;

		// B. if the method is static, no need to create an object of the class
		// with the class name mention the name of the method with scope
		// resolution operator (::)
		Invoker messageMethodInvoker = Implementation::getMessage;

		// using the interface method (invoke from Invoker) you can call those methods
		// now
		String welcomeMessage = welcomeMethodInvoker.invoke("anil");
		String message = messageMethodInvoker.invoke("sunil");

		System.out.println(welcomeMessage);
		System.out.println(message);

		// anonymous class
		Invoker anySimilarMethod = new Invoker() {

			@Override
			public String invoke(String name) {
				return "Oh my god " + name + " what have you done????";
			}
		};
		/*
		 * class DoNotKnowTheName implements Invoker{
		 * 
		 * @Override public String invoke(String name) { return "Oh my god " + name; } }
		 * DoNotKnowTheName dontKnow = new DoNotKnowTheName(); Invoker anySimilarMethod
		 * = dontKnow::invoke;
		 */
		String returnedMessage = anySimilarMethod.invoke("joydip");
		System.out.println(returnedMessage);

		// A. Lambda expression (anonymous method)
		Invoker randomMethod = (String x) -> {
			return "This is too much, " + x;
		};
		/*
		 * class Unknown{
		 * 	 public String anonymousMethod(String x){
		 * 		return "This is too much, " + x;
		 * 	}
		 * }
		 * Unknown unknownObject = new Unknown();
		 * Invoker randomMethod = unknownObject::anonymousMethod;
		 * 
		 * or
		 * 
		 * * class Unknown implements Invoker{
		 * 	 public String invoke(String x){
		 * 		return "This is too much, " + x;
		 * 	}
		 * }
		 * Unknown unknownObject = new Unknown();
		 * Invoker randomMethod = unknownObject::invoke;
		 * */

		// B. Lambda expression (anonymous method) - without argument's data type and
		// parenthesis
		Invoker anotherAnonymousMethod = (name) -> "Unbelievable " + name;

		System.out.println(randomMethod.invoke("aisiri"));
		System.out.println(anotherAnonymousMethod.invoke("Bhavna"));
	}
}
