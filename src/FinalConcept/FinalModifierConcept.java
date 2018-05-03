package FinalConcept;

public class FinalModifierConcept {

	// we can declare methods as final.it prevent method overriding
	// we can override public methods and protected methods but to over ride private
	// methods not possible
	public void car() {
		System.out.println("car--class");
	}

	protected void startcar() {
		System.out.println("startcar--class");
	}

	public static void main(String[] args) {
		// final is a modifier applicable for classes ,methods and variable
		// If you declare a variable as final the value of that particular variable is
		// constant .
		// That means final keyword/modifier is used to declare Constant variables.

		final int a = 10;
		// a=20; Compile time error

	}

}
