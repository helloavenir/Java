package view;

import java.util.Scanner;


import model.Contact;

public class ContactApp {

	public static void main(String[] args) {
		Contact [] c = new Contact [3];
		Scanner scr = new Scanner(System.in);
		
		for(int i = 0; i < c.length; i++) {
			System.out.println("�̸�, ����, ��ȭ��ȣ ������ �Է� >>(����� ����) ");
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


