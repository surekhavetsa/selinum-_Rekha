package MethodsPractice;

abstract class one
{
	abstract void Add();
	abstract void Subtraction();
}


class Two extends one{
	void sub() 
	{
		int b=30;
		int f=20;
		int c=b+f;
		System.out.println(c);
	}

	@Override
	void Add() {
		int d=80;
		int e=70;
		
		System.out.println(d+e);
		
		
	}

	@Override
	void Subtraction() {
		int m=80;
		int n=50;
		System.out.println(m-n);
		
	}
	
}

public class Inheritence_concept extends Two   {
	
	
void print()
{
	System.out.println("Inheritence concept");
}
	
	public static void main(String[] args) {
		
		Inheritence_concept Ic=new Inheritence_concept();
     
		Ic.Add();
		Ic.sub();
		Ic.print();
		Ic.Subtraction();
	
	}

}
