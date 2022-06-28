package lab05;

public class ColorPoint extends Point {

	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "Yellow");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}
	
	

	@Override
	public String toString() {		
		return this.color + "색의 " + "(" + super.getX() + "," + super.getY() + ")의 점";
	}

	private void setColor(String color) {
		this.color = color;
		
	}

	private void setXY(int x, int y) {
		super.move(x, y);			
	}

}
