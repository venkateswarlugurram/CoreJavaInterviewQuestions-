package ConstructersConcept;

public class ParameterizedConstructor {

	ParameterizedConstructor(int a){
		System.out.println(a);
	}
	ParameterizedConstructor(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

	 ParameterizedConstructor pcons=new ParameterizedConstructor(1); 
	 //ParameterizedConstructor pcons=new ParameterizedConstructor(1); 
			
	}

}
