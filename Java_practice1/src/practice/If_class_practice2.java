package practice;

import java.util.Scanner;

public class If_class_practice2 {

	public static void main(String[] args) {
		//check whether number is even or odd
		 int num=56;
		
		
		 if(num%2==0)
			 {
				System.out.println("even number"); 
			 }
		 else
		 {
			 System.out.println("odd number");
		 }
		 
		 Scanner Sc=new Scanner(System.in);
		 System.out.println("enter the charcter");
		 char ch1= Sc.next().charAt(0);
		 int asciichar= (int)ch1;
		 if(( asciichar>= 97 && asciichar<= 121) || (asciichar >= 65 && asciichar<= 90))
		 {
			 System.out.println("entered  alphabet");
		 }
		 else
		 {
			 System.out.println("entered other than alphabet");
		 }
		
		 Sc.close();
		 
	}

}
