package loopingconcept;

public class Duplicate_String {

	public static void main(String[] args) {
		String [] a=new String[5];
		a[0]="Rama";
		a[1]="sita";
		a[2]="laxman";
		a[3]="Madhavi";
		a[4]="Bharata";
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate value found:"+ a[i]);
					flag=true;
            }
			}
			
		}
		if(flag==false)
		{
			System.out.println("element not found");
			
		}
		
	
	}

}
