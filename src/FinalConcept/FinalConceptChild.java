package FinalConcept;


//we can declare class as final it prevents the inheritance.
//if a parent class is final we can't inherit data members and methods to child class.


public class FinalConceptChild extends FinalModifierConcept{

	public  void car() {	//this is giving you compile time error because of final methods are can't be override.
System.out.println("car--class");			
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
