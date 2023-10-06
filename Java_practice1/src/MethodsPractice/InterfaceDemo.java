package MethodsPractice;

interface A {
	void add();

	void subtraction();
}

interface B

{
	void multiplication();

}

class calculation implements A, B {
	void divison() {
		int a = 10;
		int b = 40;
		System.out.println(b / a);
	}

	public void multiplication() {

		System.out.println("multiplication");
	}

	public void add() {

		System.out.println("add");
	}

	public void subtraction() {
		
		System.out.println("subtraction");
	}
}

public class InterfaceDemo extends calculation {
	
	

	public void add2()
	{
		
		System.out.println("add");
	}
public static void main(String[] args) {
	InterfaceDemo d1=new InterfaceDemo();
	d1.add2();
	d1.subtraction();
	
	}
	
	
	
	
}
