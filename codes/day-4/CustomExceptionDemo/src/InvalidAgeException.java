
public class InvalidAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}

	public InvalidAgeException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}
}
