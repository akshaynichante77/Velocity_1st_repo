package test;

public class If_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		for(int i=10; i>=1;i--) {
			System.out.println(i);
		}

		System.out.println("=========================");
		
		for(int i=3; i<=30; i=i+3) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			
			sum = sum+i;
			
			System.out.println(sum);
			
		}
		
		
		
	}

}
