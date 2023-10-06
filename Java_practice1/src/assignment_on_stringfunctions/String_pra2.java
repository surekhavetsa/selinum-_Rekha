package assignment_on_stringfunctions;

public class String_pra2 {

	public static void main(String[] args) {
	
		String a="surekha";
		String b="vetsa";
		String c="Ayyappa Homes";
		String d="  pallavi Guptha   ";
		
		System.out.println(a.charAt(0));
		System.out.println(b.length());
		System.out.println(a.concat(" ") .concat("vetsa"));
		System.out.println(b.concat(" ").concat("surekha"));
		System.out.println( c.substring(0,7));
		System.out.println(c.substring(8));
		System.out.println(d.trim());
		

	}

}
