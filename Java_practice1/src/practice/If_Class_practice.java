package practice;

public class If_Class_practice {
	// find maximum between two numbers

	public static void main(String[] args) {
		int a=50;
		int b=80;
		if(a>b)
		{
			System.out.println("a is greater");
		}
		else
		{
		System.out.println("b is greater");	
		}
	//find  max between 3 numbers
		
		int c=30;
		int d=10;
		int e=56;
		int f;
		  if(c>d&&c>e)
		{
			System.out.println("c is greater");
		}
		  else if (d>c&&d>e) 
		{
			System.out.println("d is greater");
		}
		  
		  else 
		  {
			  System.out.println("e is greater");
		  }
		  
	// number is negative, positive,zero	  
		
		int num=56;
		
		if(num>0)
		{
			System.out.println("positive");
		}
		else if(num<0)
		{
			System.out.println("negativr" );
		}
		else
		{
			System.out.println("zero");
		}
		
		int g=55;
		 if(g%5==0 && g%11==0)
		 
		 {
			System.out.println("divisible by 5 and 11"); 
		 }
		 else
		 {
			 System.out.println("not divisible by 5 and 11");
		 }
	}

}
