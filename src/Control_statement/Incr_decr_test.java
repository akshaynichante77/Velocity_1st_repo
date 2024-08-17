package Control_statement;

public class Incr_decr_test {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		System.out.println(a);
		a = a+5;
		System.out.println(a);//15
		
		System.out.println(a++);//15// post increment
		System.out.println(a);//16
		
		System.out.println(++a);//17// pre increment
		
		System.out.println(a++);//17
		System.out.println(a);//18
		
		// Postt decr and pre decrement
		
		// b = 20
		System.out.println(--b);//19
		System.out.println(b--);//19
		System.out.println(b);//18
		
		System.out.println(1-b);


		
		
		
	}

}
