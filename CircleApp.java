package ex4_6;
//반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고,
//배열에 있는 모든 Circle 객체의 면적을 출력하라.

public class CircleApp {

	public static void main(String[] args) {
		Circle c1 = new Circle(0);
		Circle c2 = new Circle(1);
		Circle c3 = new Circle(2);
		Circle c4 = new Circle(3);
		Circle c5 = new Circle(4);
		
		Circle c[] = new Circle[5];
		
		for(int i = 0; i <c.length; i++) {
			c[i] = new Circle(i);
		}
		
//		System.out.println("반지름 0인 원면적: " + c1.getArea());
//		System.out.println("반지름 1인 원면적: " + c2.getArea());
//		System.out.println("반지름 2인 원면적: " + c3.getArea());
//		System.out.println("반지름 3인 원면적: " + c4.getArea());
//		System.out.println("반지름 4인 원면적: " + c5.getArea());
		
		for(int i = 0; i <c.length; i++) {
			System.out.println("반지름 " + i + "인 원면적은 " + c[i].getArea());
		}
		
		// TODO Auto-generated method stub

	}

}
