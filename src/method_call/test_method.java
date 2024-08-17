package method_call;

public class test_method {

	public static void main(String[] args) {
		method1();
		System.out.println("This is the main method");
			
		test_method pune = new test_method();// classname obj = new classname
		pune.method2();
		

	}
	
	public static void method1()// method body should be present.// this is static method we can directly call
	{
		System.out.println("Hii This is static regular method1");
	}
	
	
	public void method2() // if we remove static so code not run// non static method we need object
	{
		System.out.println("This is non static method with object");
	}

}
