package StaticKeywordConcept;

public class StaticBlock {

	//static blocks are used to intialize class variables or we can say static variables.
	//we can override static variables.
	
	
static	int a ;
	static String s;
	

static	int b ;
	static String s1;
	
	static {
		System.out.println("block 1");
		//here the variables a,s are overridden by block2 variables a,s
		a=10;
		s="selenium";
	}
	
	static {
		System.out.println("block 2");
		a=20;
		s="selenium webdriver";
	}
	
	
	static {
		System.out.println("block 3");
		b=30;
		s1="selenium grid";
	}
	
	
	public static void main(String[] args) {

	System.out.println(a);
		System.out.println(s);
		

		System.out.println(b);
			System.out.println(s1);
					
	}

}
