package InterviewQuestions;

public class StringandStringBufferConcept {
	
	public static void main(String args[]) {
		//Once String object is created   we cannot perform any changes in the existing object why because of String is immutable
		//Still if want to do changes with  the existing object those new changes,new String object will be created.
		String s=new String("Selenium");
		String s1=s.concat("WebDriver");
		System.out.println(s);
		System.out.println(s1);
		
		

		//Once  StringBuffer object is created  we can perform any changes in the existing object why because of StringBuer is mutable
		System.out.println("$$$$$$$$$$$$$");
		StringBuffer sb=new StringBuffer("software");
		sb.append("testing");
		System.out.println(sb);
	}


}
