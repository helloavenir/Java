package stringEx;

public class StringTest {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String("Hello");
		
		if(s == t) System.out.println("=:����");
		if(s.equals(t)) System.out.println("equals:����");
        
		System.out.println(s.concat("Java")); 
		System.out.println(t.concat("Java")); 
	}

}
