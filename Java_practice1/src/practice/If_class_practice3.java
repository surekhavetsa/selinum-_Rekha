package practice;

import java.util.Scanner;

public class If_class_practice3 {

	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		if(num==1)
		{
			System.out.println("sunday");
		}
		else if (num==2)
		{
			System.out.println("monday");
		}
		else if(num==3)
		{
		   System.out.println("tuesday");
		   
		}
		else if(num==4)
		{
			System.out.println("wednesday");
		
		}
		else
		{
			System.out.println("friday");
		}*/
		
		//print the student result based on the grading system
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter num value");
		int num1=sc1.nextInt();
		if(num1<35)
		{
			System.out.println("fail");
		}
		else if(num1==35)
		{
			System.out.println("pass");
			
		}
		else if(num1>35&&num1<70)
		{
			System.out.println("third class");
		}
		else if(num1>70&&num1<85)
		{
			System.out.println("second class");
		}
		else
			System.out.println("first class");
	}
	
	
	
	
	

}
