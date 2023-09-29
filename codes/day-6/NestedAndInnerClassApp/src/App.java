import java.util.Set;

public class App {

	public static void main(String[] args) {
		// since Inner class is non-static, you have to first create instance of Outer
		// class
		// then with outer class instance, using new keyword, you have to create
		// instance of Inner class
		Outer outerObject = new Outer();
		Outer.Inner innerObject = outerObject.new Inner();
		innerObject.foo();

		// since StaticInner class is static, you DON'T have to first create instance of
		// Outer class
		// with Outer class name, using new keyword, you have to create
		// instance of Inner class

		Outer.StaticInner staticInnerObject = new Outer.StaticInner();
		staticInnerObject.staticFoo();

		/*
		 * MyHashMap<Integer, String> map = new MyHashMap<>(); map.put(1, "bangalore");
		 * map.put(0, "Oracle");
		 */

		// Set<MyHashMap<Integer, String>.Entry<Integer, String>> set = map.entrySet();

		CPU cpu = new CPU();
		CPU.RAM ram1 = cpu.new RAM();
		CPU.Processor processor1 = cpu.new Processor();

		//anonymous inner class of the class Polygon
		// created object of an anonymous inner class 
		// extending the Polygon class
		Polygon polygonObject = new Polygon() {
			@Override
			public void display() {
				System.out.println("it is some shape");
			}
		};
		polygonObject.display();

		//named inner class of the class Polygon: SomeShape
		Polygon poly = new Polygon();
		Polygon.SomeShape shape = poly.new SomeShape();
		shape.display();

		//anonymous inner class of the interface Shape
		// creating an object of anonymous inner class of the interface Shape,
		// implementing the interface itself
		Shape shapeRef = new Shape() {
			@Override
			public void calculateArea() {
				// TODO Auto-generated method stub

			}

			@Override
			public double getArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		//named inner class of the interface Shape: SomeShape
		Shape anotherShapeRef = new Shape.SomeShape();
		anotherShapeRef.getArea();
	}

}
