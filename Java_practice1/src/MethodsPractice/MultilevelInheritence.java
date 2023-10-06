package MethodsPractice;

public class MultilevelInheritence {

	public static void main(String[] args) {
		InterfaceDemo if1=new InterfaceDemo();
		if1.add();
		if1.add2();
		if1.divison();
		if1.subtraction();
		if1.multiplication();
		calculation cal=new calculation();
		
			cal.add();
			cal.multiplication();
			cal.subtraction();
			cal.divison();

	}

}
