package ConstructersConcept;

public class CopyConstructor_Java {

	//there is no copy constructor in java 	
	//but we can copy the values of one object into another object like copy constructor in c++
	//we can copy the value of one object into anther object by using 1.constructor 2.assing values of one object to another object 
	//3.By clone() method of object class
	int id;
	String name;
	
	
	CopyConstructor_Java(int i,String n){
		id=i;
		name=n;
		
		System.out.println(i+""+n);
		//System.out.println(n=name);
		
	}
	
	CopyConstructor_Java(){
		System.out.println(id +""+name);
	}
	
	
	/*CopyConstructor_Java(CopyConstructor_Java j){
		System.out.println(this.id=j.id);
		System.out.println(this.name=j.name);
		
	}
	*/
	public static void main(String[] args) {
		CopyConstructor_Java cons=new CopyConstructor_Java(123,"venky");
		//CopyConstructor_Java cons1=new CopyConstructor_Java(cons);
		
		CopyConstructor_Java cons2=new CopyConstructor_Java();
		
		cons2.id=cons.id;
		cons2.name=cons.name;
		
		
	}

}
