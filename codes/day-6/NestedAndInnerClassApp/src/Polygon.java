
public class Polygon {
	public void display() {
		System.out.println("It is a polygon");
	}

	class SomeShape extends Polygon {
		@Override
		public void display() {
			System.out.println("It is some shape");
		}
	}

	/*class OtherShape {
		public void foo() {
			display();
		}
	}*/
}
/*
 * Polygon polygonObject = new Polygon() {
 * 
 * 	@Override 
 * 	public void display() {
 * 		system.out.println("other shape"); 
 * 	} 
 * };
 */
