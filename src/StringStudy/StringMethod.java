package StringStudy;

public class StringMethod {

	public static void main(String[] args) {
		
		String A = "Akshay";
		System.out.println("Length of string is " +A.length());
		
		int B = A.length();
		System.out.println("Length of B is "+B);
		
		System.out.println("Upper care value is "+A.toUpperCase());
		System.out.println("Lower case value is "+A.toLowerCase());
		
		
		
		String C = "Akshay";
		System.out.println(A==C); // return only true and false
		System.out.println("Equals is "+A.equals(C));
		
		

	}

}
