package loopingconcept;

import java.util.Scanner;

public class loop_pract5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter starting  number");
		   int a =sc.nextInt();
		System.out.println("Enter ending number");
		int b=sc.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++) {
			if(i%2==0)
			sum=sum+i;
		}	
		System.out.println(sum);		
				
		sc.close();
	}

}
