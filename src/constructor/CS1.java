package constructor;

public class CS1 {// should no return type // constructor should be same as class name 
	
	public CS1()// we can write multiple constructor// but parameter ka data type should be different 
	{
		System.out.println("without paramter constructor");
	}

	public CS1(int a)
	{
		System.out.println("with paramter constructor "+a);
	}
	
	public CS1(String a)
	{
		System.out.println("with paramter constructor "+a);
	}
	
	public static void main(String[] args) {
		CS1 cs1 = new CS1();
		CS1 cs2 = new CS1(10);
		CS1 cs3 = new CS1("Akshay");

	}

}
