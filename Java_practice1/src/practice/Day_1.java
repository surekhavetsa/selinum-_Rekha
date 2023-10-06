package practice;

public class Day_1 {

	public static void main(String[] args) {
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println();
		//print 8 table
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("8*"+i+"="+(8*i));
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
