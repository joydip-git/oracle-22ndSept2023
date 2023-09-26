
//public final class Sample {

public class Sample {

	private final String SAMPLE_DATA = "sample class data";
	private static String staticData;

	static {
		System.out.println("static block");
		staticData = "static data";
	}

	public final String getSampleData() {
		return SAMPLE_DATA;
	}
}
