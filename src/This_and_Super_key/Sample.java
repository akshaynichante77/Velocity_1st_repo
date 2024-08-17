package This_and_Super_key;

public class Sample {
	
	int a = 90;// both variable name are same on global and local side.
	int b = 10;
	
	static int x = 88;

	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.add();

	}
	
	public void add() {
		int a = 10;
		int sum = a + 100;
		System.out.println(sum);// normal way
		
		int sum1 = this.a + 100;// using this keyword we are fetching global value
		System.out.println(sum1);
		//============================================
		
		int sub = 100 - b;
		
		int x = 10;
		int sub1 = 100-x;
		System.out.println(sub);//90
		
		int sub2 = 100-this.x;// if want to call using static way then int sub2 = 100-Sample.x;
		System.out.println(sub2);//12
		
	}

}
