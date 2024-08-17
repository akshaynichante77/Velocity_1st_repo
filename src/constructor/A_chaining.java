package constructor;

public class A_chaining {
	
	public A_chaining() {// user defined// 0 paramter const
		
		//this(12);// calling paramter const  const 
		this("Velocity"); // only  1 this key word we can used here.
		System.out.println("// user defined// 0 paramter const");
		
	}
	
	public A_chaining(int a) { // ek const se dusre const ko call dena call const chaning 
		// ex. if iw ant to call const_chan(int) with creating any object of para const
		System.out.println("Single paramter const");
		System.out.println(a);
	}

	public A_chaining(String name) {
		System.out.println(name);
	}
	
	public static void main(String[] args) {

		A_chaining a = new A_chaining();
		// Const_chaining a1 = new Const_chaining(99);
		

	}

}
