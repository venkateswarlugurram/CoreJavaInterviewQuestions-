package ConstructersConcept;

public class CopyConstructors {

String username;
String password;
 
		public CopyConstructors() {

		}
		public CopyConstructors(String user,String pass) {
			username=user;
			password=pass;
				}

		void disp() {
			System.out.println(username);
			System.out.println(password);
	
		}
public static void main(String args[]) {

	CopyConstructors c1=new CopyConstructors("venky","venky@123");
	CopyConstructors c2=new CopyConstructors();
	c2.username=c1.username;
	c2.password=c1.password;
	c1.disp();
	c2.disp();
	
}























}