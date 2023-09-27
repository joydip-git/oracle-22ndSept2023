
public class App {

	public static void main(String[] args) {
		DrivingLicenseApplication application = null;
		try {
			application = new DrivingLicenseApplication("anil", 16);
			/*
			 * application = new DrivingLicenseApplication(); 
			 * application.setName("anil");
			 * application.setAge(16);
			 */
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
