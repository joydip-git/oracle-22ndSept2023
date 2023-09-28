
public class Sample {
	public String sayHi(String name) {
		return "Hi " + name;
	}

	public static String sayBye(String name) {
		return "Bye " + name;
	}

	public void exit(String name) {
		System.out.println(name + " exited");
	}

	public String exit() {
		return " exited";
	}

	public void exit(String name, String message) {
		System.out.println(name + " exited " + message);
	}
	public String exitAgain(String name, String message) {
		return name + " exited " + message;
	}
}
