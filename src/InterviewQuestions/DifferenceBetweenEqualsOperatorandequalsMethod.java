package InterviewQuestions;

public class DifferenceBetweenEqualsOperatorandequalsMethod {

	public static void main(String[] args) {

		// == Operator is used to compare references
		//.equals() is used to compare content
		
		String s= new String("selenium");
		String s1=new String("selenium");
		System.out.println(s==s1);//false
		System.out.println(s.equals(s1));//true
		
		
	}

}
