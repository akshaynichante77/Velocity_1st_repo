package Inheritance_example;
//// Multivevel
public class Multilevel_inher {

	public static void main(String[] args) {
		
		sonn s = new sonn();// create obj of child class acnn call all properties
		s.keys();;//super class property
		s.reciepe();//super class property
		s.home();//super class property
		s.money();//super class property
		s.mobile();// properties of own class
		s.laptop();// properties of own class
		
		System.out.println("============================");
		
		Motherr m = new  Motherr();// obj of super class can call own and its super class
		m.keys();//super class property
		m.reciepe();//super class property
		m.home();//properties of own class
		m.money();//properties of own class
		
		System.out.println("=============================");
		
		Grand_mother n = new Grand_mother();// can call only own properties
		n.keys();;//properties of own class
		n.reciepe();//properties of own class
		
	}

}
