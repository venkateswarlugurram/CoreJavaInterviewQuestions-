package FinallyBlockConcept;

public class FinalizeClass {
	// finalize method is automatically called by the GC before destroying the
	// object to perform clean up activities
//Note:finally block ment for clean up activities related to try and catch
	// where as finalize method is used to perfrom clean up activites related to
	// object

	public void finalize() {
		System.out.println("JVM execute automatically");
	}

	public static void main(String[] args) {

		FinalizeClass finalize = new FinalizeClass();
		FinalizeClass finalize1 = new FinalizeClass();
		finalize = null;
		finalize1 = null;

		System.gc();// manually calling Garage collector
	}

}
