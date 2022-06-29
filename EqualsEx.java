package basicPac;

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		if(a == b) System.out.println("a==b 같다.");
		else System.out.println("a==b 다르다.");
		
		if(a.equals(b)) System.out.println("a equals b");
		else System.out.println("a not equals b 다르다");

	}

}
