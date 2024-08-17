package methods_study;

public class StudentInfo {

	public static void main(String[] args) {
		
		StudentInfo info = new StudentInfo();
		info.displayInfo();

	}
	
	public void displayInfo() {
		String name = "Akshay";
		int rollnum = 32;
		float age = 27.5f;
		char div = 'B';
		float mark = 78.5f;
		boolean result = true;
		
		System.out.println("======================");
		System.out.println("Student name is "+name);
		System.out.println("Student name is "+rollnum);
		System.out.println("Student name is "+age);
		System.out.println("Student name is "+div);
		System.out.println("Student name is "+mark +"%");
		System.out.println("Student name is "+result);
		System.out.println("======================");
		
	}

}
