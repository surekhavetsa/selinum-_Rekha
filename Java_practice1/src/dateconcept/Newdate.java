package dateconcept;

import java.util.Date;

public class Newdate {

	public static void main(String[] args) {
		
		Date d1= new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String date=d2.toString();
		System.out.println(date);
		String month=date.substring(4, 7);
		System.out.println(month);
				
	}

}
