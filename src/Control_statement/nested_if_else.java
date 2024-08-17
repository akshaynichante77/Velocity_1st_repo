package Control_statement;

public class nested_if_else {

	public static void main(String[] args) {
		String UN = "AN1787";
		String PASS = "kshay@123";
		
		if (UN == "AN1787") {
			System.out.println("username is correct");
		
		
				if (PASS == "Akshay@123") {
					System.out.println("Login sucessful");
				}
		
		}
		
		else {
			System.out.println("incorrect username, unable to login");
		}
		

	}

}
