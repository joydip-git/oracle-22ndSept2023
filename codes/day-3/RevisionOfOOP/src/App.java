
public class App {

	public static void main(String[] args) {
		Sample sample = new Sample();
		System.out.println(sample.getSampleData());

		Sample sampleAgain = new Sample();
		System.out.println(sampleAgain.getSampleData());

		// DataReader reader = new DataReader();

		// declaring a reference variable (reader) of type - DataReader (the base class)
		// this reference variable can store reference of any instance of a class which
		// extends DataReader class
		DataReader reader = null;

		// currently it storing reference of DbDataReader child class instance
		reader = new DbDataReader();

		// calling the overriden method from the DbDataReader child class
		String data = reader.getData();
		System.out.println(data);

		// implicitly invoking interface member through child class type reference variable
		// (laptopDevice)
		Laptop laptopDevice = new Laptop();
		laptopDevice.type("data to be typed");

		// explicitly invoking interface member through interface type reference variable
		// (device)
		Device device = null;
		device = new Laptop();
		device.type("data to be typed");
	}

}
