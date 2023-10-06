package loopingconcept;
//odd numbers between required numbers
import java.util.Scanner;

public class Loop_practie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt(); 
		
		for(int i=a;i<=b;i++) {
			if(i%2!=0) {
			System.out.println(i);	
			}
		}
		sc.close();
		

	}

}
