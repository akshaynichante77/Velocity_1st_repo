package Inheritance_example;
// Single level exaple
public class Single_level {

	public static void main(String[] args) {

		Mother m = new Mother();
		m.home();// mother class
		m.money();//mother class
		
		System.out.println("======================");
		
		son s = new son();// create obj of child class
		s.home();// using super class property
		s.money();// using super class property
		s.laptop();// using own property
		
		
		
	}

}
