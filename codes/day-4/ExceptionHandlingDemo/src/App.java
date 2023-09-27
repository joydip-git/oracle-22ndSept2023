
public class App {

	static void print() {
		try {
			int[] arr = new int[2];
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			// throw the exception reference back to the caller of this method
			throw ex;
		} catch (Exception e) {
			throw e;
		}
	}

	static void divide(int a, int b) throws ArithmeticException {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		//Class.forName("abc");
		divide(10, 0);

//		try {
//			// print();
//
//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("array index catch block");
//			System.out.println("Message: " + ex.getMessage());
//			System.out.println("Type: " + ex.getClass().getName());
//			ex.printStackTrace();
//		} catch (ArithmeticException ex) {
//			System.out.println("divide by zero catch block");
//			System.out.println("Message: " + ex.getMessage());
//			System.out.println("Type: " + ex.getClass().getName());
//			ex.printStackTrace();
//		} catch (Exception ex) {
//			System.out.println("exception catch block");
//			System.out.println("Message: " + ex.getMessage());
//			System.out.println("Type: " + ex.getClass().getName());
//			ex.printStackTrace();
//		} finally {
//			System.out.println("end of code");
//		}
	}

}
