package SeleniumTest;

public class FinalizeConcept {

	public void finalize() {

		System.out.println("This Method will be called depends on GC");

	}

	public static void main(String[] args) {

		FinalizeConcept b1 = new FinalizeConcept();
		FinalizeConcept b2 = new FinalizeConcept();
		FinalizeConcept b3 = new FinalizeConcept();

		b1 = null;
		b2 = null;
		b3 = null;

		System.gc();

	}

}
