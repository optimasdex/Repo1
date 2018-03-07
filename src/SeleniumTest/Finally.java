package SeleniumTest;

public class Finally {

	public static void main(String[] args) {

		Finally t = new Finally();
		t.test1();
		
		test2();
	}

	public void test1() { 

		try {

			System.out.println("Inside try block");
			throw new RuntimeException("exception thrown");

		} catch (Exception e) {

			System.out.println("Inside catch block");
		}

		finally {

			System.out.println("Inside finally block");
		}
	}

	public static void test2() {
		System.out.println("Method test2");
	}

}
