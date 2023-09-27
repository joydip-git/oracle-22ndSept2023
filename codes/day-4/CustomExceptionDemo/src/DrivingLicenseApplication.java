
public class DrivingLicenseApplication {
	private String name;
	private int age;

	public DrivingLicenseApplication() {

	}

	public DrivingLicenseApplication(String name, int age) throws InvalidAgeException {
		super();
		this.name = name;
		// this.age = age;
		this.setAge(age);
		/*
		 * try { this.setAge(age); } catch (InvalidAgeException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	/*
	 * public void setAge(int age) { if (age < 18) { Exception ex = new
	 * Exception("valid age for driving license is 18 or above"); try { throw ex; }
	 * catch (Exception e) { // TODO Auto-generated catch block e.printStackTrace();
	 * } } else this.age = age; }
	 */
	public void setAge(int age) throws InvalidAgeException {
		if (age < 18) {
			// Exception ex = new Exception("valid age for driving license is 18 or above");
			InvalidAgeException ex = new InvalidAgeException("valid age for driving license is 18 or above");
			throw ex;
		} else
			this.age = age;
	}

}
