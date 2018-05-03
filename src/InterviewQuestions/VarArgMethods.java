package InterviewQuestions;

public class VarArgMethods {

	public static void sum(int... a) {

		// System.out.println("i am from vararg methods");

		int total = 0;
		for (int x : a) {
			total = total + x;
		}

		System.out.println(total);
	}

	public static void main(String[] args) {
		// VarArgMethods means variable number of argument methods this concept was
		// introduced in java 1.5 version on words.
		// the main purpose of this method is code reusing

		sum();
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);

	}

}
