package view;

import model.Book;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Book [] b = new Book[2];
		Scanner scr = new Scanner(System.in);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("å ����� ���� �Է� >>(����� ����) ");
			String title = scr.next();
			String author = scr.next();
			b[i] = new Book(title, author);
		}
		
		//å ����Ʈ ���
		for(int i = 0; i < b.length; i++) {
			System.out.println("(" + b[i].getTitle() + "," +  b[i].getAuthor() + ")");
		}	
	scr.close();
	}

}
