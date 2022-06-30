package stringEx;

public class StringTest {

	public static void main(String[] args) {
		String s = "Hello";
		String t = new String("Hello");
		
		if(s == t) System.out.println("=:같다");
		if(s.equals(t)) System.out.println("equals:같다");
        
		System.out.println(s.concat("Java")); 
		System.out.println(t.concat("Java")); 
	}

}
