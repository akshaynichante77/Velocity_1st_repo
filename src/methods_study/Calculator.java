package methods_study;

public class Calculator {

	public static void main(String[] args) {
		Calculator calculate = new Calculator();
		calculate.add();
		calculate.sub();
		mul();
		calculate.div();
	}
	
	public void add() {
		int a = 10; // vairable declaration/ initialization
		int b = 20;
		int summ = a + b;
		System.out.println("Addition is "+summ);
		
	}
	
    public void sub() {
    	int a = 20;
    	int b = 30;
    	int subst = a - b;
    	System.out.println("Substaraction is "+subst);
    }	
    
    public static void mul() {
    	int a = 20;
    	int b = 30;
    	int multi = a*b;
    	System.out.println("Multipication is "+multi);
    }	
    
    public void div() {
    	int a = 100;
    	int b = 90;
    	float subst = a / b;
    	System.out.println("Division is "+subst);
    }	

}
