package java03day;

import java.util.Scanner;

public class lab02 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		System.out.println("두 자리 정수 입력(10~99)>> ");
		int number = scr.nextInt();
		int digit10 = number/10;
		int digit1 = number%10;
		
		if (digit10 == digit1) {
			System.out.println("10의 자리의 수와 1의 자리의 수가 같습니다.");
		}
		else System.out.println("10의 자리의 수와 1의 자리의 수가 다릅니다.");

		scr.close();
	}

}
