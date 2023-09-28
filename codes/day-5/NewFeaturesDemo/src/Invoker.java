@FunctionalInterface
public interface Invoker {
	String invoke(String value);
	// void add();<-- not permitted
}

//this functional interface can be used to store reference of as well as call any method whose return type is String and accepts exactly one argument of type String
