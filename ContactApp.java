package view;

import java.util.Scanner;


import model.Contact;

public class ContactApp {

	public static void main(String[] args) {
		Contact [] c = new Contact [3];
		Scanner scr = new Scanner(System.in);
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("이름, 나이, 전화번호 순으로 입력 >>(띄어쓰기로 구분) ");
			String name = scr.next();
			int age = scr.nextInt();
			String phoneNumber = scr.next();
			c[i] = new Contact(name, age, phoneNumber);
		}
		
		for(int i = 0; i < c.length; i++) {
			c[i].showInfo();
		}	
	scr.close();
	}

		// TODO Auto-generated method stub

}


