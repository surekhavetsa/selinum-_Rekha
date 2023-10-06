package practice;

public class This_usage {
	This_usage(String b)
	   {
		System.out.println(b);
	   }
	
	This_usage()
		{
		this("surekha");
			System.out.println("1st statement");
		}
	
				
		This_usage(int a,int b)
		{
			this();
			System.out.println("2nd statement");
		
		}
public static void main(String[] args)
{
	
	 This_usage Tu1= new This_usage(20,40);
	
}






}

