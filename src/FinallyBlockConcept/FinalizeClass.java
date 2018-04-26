package FinallyBlockConcept;

public class FinalizeClass {
	//finalize method is used to clean up processing of objects 
	//finalize method is automatically called by the JVM before Executing the GC
	public  void finalize() {
		System.out.println("JVM execute automatically");
	}

	public static void main(String[] args) {

		FinalizeClass finalize=new FinalizeClass();
		FinalizeClass finalize1=new FinalizeClass();
		finalize=null;
		finalize1=null;
		
		System.gc();//manually calling Garage collector
	}

}
