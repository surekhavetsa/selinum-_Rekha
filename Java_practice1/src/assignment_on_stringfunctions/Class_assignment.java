package assignment_on_stringfunctions;

import java.util.Date;

public class Class_assignment {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		String formate=d2.toString();
		int length=formate.length();
		System.out.println(length);
		String month=formate.substring(4,7);
		System.out.println(month);
		String year=formate.substring(24);
		System.out.println(year);
		String day=formate.substring(0, 3);
		System.out .println(day);
		String date1=formate.substring(8, 10);
		System.out.println(date1);
		String todaydate=date1.concat(month). concat(year);
		System.out.println(todaydate);
				
		
		
	}

}
