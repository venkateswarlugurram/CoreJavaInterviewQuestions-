package FinallyBlockConcept;

public class FinallyBlok {

	//finally is a block always associated with try and catch block.
	//finally block always executes even exception occurs.
	// in try block we have specify the risk code and catch block write a code for handling 
	//we can write multiple catch block for one single try block
	
	public static void main(String[] args) {

		try{
			System.out.println("try--block");
			throw new ArithmeticException() ;
		}catch (NullPointerException e) {
			System.out.println("catch--block");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception--block");
		}
		finally {
		System.out.println("this block will always executes even after exception occurs");
		}
	}

}
