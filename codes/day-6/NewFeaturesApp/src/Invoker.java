
//descriptor interface
@FunctionalInterface
public interface Invoker {
	String invoke(String name);
}

//a functional interface, through its method, describes reference of which type of methods can be
//stored in that interface variable and can be called. that is why the functional interfaces are also known as
//descriptor interface

//the purpose of functional interface is to store reference of any method (matching to the signature of the
//interface method) and call that method using interface's own method
