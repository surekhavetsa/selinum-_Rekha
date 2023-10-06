package loopingconcept;

import java.util.Scanner;
//printing even numbers between required numbers
public class Loop_prac4 {

public static void main(String[] args) {


	Scanner sc= new Scanner(System.in);
	System.out.println("Enter starting  number");
	int a //even numbers between 200 and 500
	=sc.nextInt();
	System.out.println("Enter ending number");
	int b=sc.nextInt();
	for(int i=a;i<=b;i++) {
		if(i%2==0)
	
		System.out.println(i);
		}
	

	
		sc.close();
		 
	}

}
