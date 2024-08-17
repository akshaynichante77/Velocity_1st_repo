package test;

public class Mock_test {
	
	public Mock_test () {
		int a = 10;
		int b = 30;
		int c = a+b;
		System.out.println("Addition is " +c);
	}
	
	public Mock_test (int a) {
		System.out.println(a);// 
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("Addition is "+c);
		
		Mock_test Akshay = new Mock_test();// non parat
		Mock_test Ak = new Mock_test(50);// paramterized
		Mock_test N = new Mock_test();// non static mthd
		N.Hello();
		Hii();// non static
		
		New_mock mock = new New_mock();
		New_mock.stat();//call static mthod
		mock.Non_stac();// non static mthod//obj.mthod name
		
		
	}
	
	public void Hello () {// non static method
		int a = 20;
		int b = 30;
		int c = a-b;
		
		System.out.println("sub is "+c);
	}
	
	public static void Hii() {// non static
	
		String a = "Akshay";
		System.out.println("name is "+a);
	}
	

}
