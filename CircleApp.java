package ex4_6;
//�������� 0~4�� Circle ��ü 5���� ������ �迭�� �����ϰ�,
//�迭�� �ִ� ��� Circle ��ü�� ������ ����϶�.

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
		
//		System.out.println("������ 0�� ������: " + c1.getArea());
//		System.out.println("������ 1�� ������: " + c2.getArea());
//		System.out.println("������ 2�� ������: " + c3.getArea());
//		System.out.println("������ 3�� ������: " + c4.getArea());
//		System.out.println("������ 4�� ������: " + c5.getArea());
		
		for(int i = 0; i <c.length; i++) {
			System.out.println("������ " + i + "�� �������� " + c[i].getArea());
		}
		
		// TODO Auto-generated method stub

	}

}
