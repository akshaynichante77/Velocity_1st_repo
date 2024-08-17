package constructor;

public class B_chaining extends A_chaining{
	
	public B_chaining() {
		
		//super("Pune"); // only  1 this key word we can used here.
		super(10);// calling class A paramter
		//this(111);// only 1 key word i possible with 1st line
		System.out.println("class B const");
	}
	
	public B_chaining(int b) {
		System.out.println("Class B const");
	}
	

	public static void main(String[] args) {


		B_chaining b = new B_chaining();
		
	}

}
