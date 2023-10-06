package loopingconcept;

import java.util.Scanner;

public class loop_practice5 {
	//print the num divisible by 7
 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting  number");
		   int a =sc.nextInt();
		System.out.println("Enter ending number");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%7==0)
		System.out.println(i);		
}	
      sc.close();
	}

}
