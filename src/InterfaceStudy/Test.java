package InterfaceStudy;

public class Test {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);//all change the value
		
		a = a+2;//reinitialize
		System.out.println(a);// allow chnge the vaue
		
		final int b = 10;
		System.out.println(b);
		//b = b+2; // once we declare then we can not initialize opertion again
		
		int c = 1;
		
	}
	
	public void demo() {
		 System.out.println("Demo method from test class");
	}

}
