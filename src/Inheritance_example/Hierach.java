package Inheritance_example;

public class Hierach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter d = new Daughter();// create obj of child class can call all properties
		d.jewl();;//sub class calling own property
		d.home();//sub class calling super class property
		d.money();//super class property
		d.emotion();//sub class properties of own class
		
		System.out.println("============================");
		
		son o = new  son();// obj of super class can call own and its super class
		o.home();//sub class calling parent class property
		o.laptop();//sub class properties of own class
		
	}

}
