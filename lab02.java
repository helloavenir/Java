package java03day;

import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("�� �ڸ� ���� �Է�(10~99)>> ");
		int number = scr.nextInt();
		int digit10 = number/10;
		int digit1 = number%10;
		
		if (digit10 == digit1) {
			System.out.println("10�� �ڸ��� ���� 1�� �ڸ��� ���� �����ϴ�.");
		}
		else System.out.println("10�� �ڸ��� ���� 1�� �ڸ��� ���� �ٸ��ϴ�.");

		scr.close();
	}

}
