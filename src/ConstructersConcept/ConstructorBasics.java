package ConstructersConcept;

public class ConstructorBasics {

	// a constructor with zero parameters is called as default constructor
   ConstructorBasics(){
		System.out.println("i am default constructor");
		int a =10;
		int b=20;
		System.out.println("values of is a is"+" "+a);
		System.out.println("values of is b is"+" "+b);
   }

 //compiler will consider it as a method because of it has return type
 void ConstructorBasics(){
		System.out.println("i am  constructorBasics method");
	}
 
 //constructor with specific number of parameters is called parameterized constructor.
 	ConstructorBasics(int a,int b){//double parameterized constructor
 		
 		int c=a+b;
 		System.out.println("addition value is -->"+""+c);
 	}
 
	ConstructorBasics(int a,int b,int c){
 		
 	int	d=a+b+c;
 		System.out.println("addition value is -->"+""+d);
 	}
 
 	
 	
	
	void method1 () {
		System.out.println("i am from method1");
	}
	
	
	public static void main(String[] args) {

		ConstructorBasics cons=new ConstructorBasics();
		ConstructorBasics cons1=new ConstructorBasics();
		
		ConstructorBasics cons2=new ConstructorBasics(1,2);
		ConstructorBasics cons3=new ConstructorBasics(2,2);
	//	ConstructorBasics cons4=new ConstructorBasics(2,3,4);
		
		cons.method1();
		cons.ConstructorBasics();
	}

}
