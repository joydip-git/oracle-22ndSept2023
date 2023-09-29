
public class Outer {
	private String name;
	private static String value;

	public Outer() {
		name = "No Name";
		value = "No value";
	}

	class Inner {
		public void foo() {
			System.out.println("Inside foo of Inner class");
			System.out.println(name);
			System.out.println(value);
		}
	}

	static class StaticInner {
		public void staticFoo() {
			System.out.println("Inside staticFoo of StaticInner class");
			// System.out.println(name);
			System.out.println(value);
		}
	}
}

interface Sample {
	public class SampleInner {

	}

	public static class StaticSampleInner {

	}
}
