
public interface Shape {
	void calculateArea();

	double getArea();

	public static String getData() {
		return "data";
	}

	public default String getMessage() {
		return "default method in interface";
	}

	public class SomeShape implements Shape {

		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void calculateArea() {
			// TODO Auto-generated method stub

		}
	}
}
