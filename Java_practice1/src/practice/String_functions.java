package practice;

public class String_functions {

	public static void main(String[] args) {
		
		String a="surekha";
		String b="Rishil";
		String C= "India is my country";
	    String d="   Hyderabad is my own town"   ;
	    String e="Dinner Time";
	    System.out.println(a.length());
	    System.out.println(a.toUpperCase());
	    System.out.println(b.toLowerCase());
	    System.out.println(a.indexOf('u'));
	    System.out.println(C.charAt(9));
	    System.out.println(a.indexOf('u'));
	    System.out.println(e.substring(7));
		System.out.println(C.substring(6,15));
	    System.out.println(a.matches(b));
		System.out.println(d.trim());
		System.out.println(a.concat(" ").concat("Guptha"));
		System.out.println(C.substring(0,5 ));
	}

}
