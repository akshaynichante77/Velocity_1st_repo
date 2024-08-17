package Control_statement;

public class for_loop_2 {

	public static void main(String[] args) {
	
		// If we want print table 3
		// initialization -> 3
		//condition -> 30
		//updation i+3
		
		for(int i=3; i<=30; i=i+3) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		for (int x=30; x>=3;x=x-3) {
			System.out.println(x);
		}
		
		System.out.println("===========================");
		
		// we want to print pune 5 times
		
		for(int i=1; i<=5;i++) {
			System.out.println("Pune");
		}

	}

}
