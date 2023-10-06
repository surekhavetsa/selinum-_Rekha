package assignment_on_stringfunctions;

import java.util.Scanner;

public class String_practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String D=sc.next();
		System.out.println("Enter number");
		int E=sc.nextInt();
	    String f=D.toUpperCase(); 
	    char c= D.toUpperCase().charAt(E);
	    
	    
	    /*String first = D.substring(0,E);
	    char middle= D.toUpperCase().charAt(E);
	    String last= D.substring(E+1);
	    
	    System.out.println(first+middle+last);
	    
	     char[] V =  D.toCharArray();
	     V[E] =  Character.toUpperCase(V[E]);
	     System.out.println(V);
        */
	    for(int i=0;i<D.length();i++)
	    {
	    	if(i==E)
	    	{
	    	   System.out.print(D.toUpperCase().charAt(i));
	    	}
	    	else
	    	{
	    		System.out.print(D.toLowerCase().charAt(i));
	    	}
	    }
	    }


	  
		
	}


