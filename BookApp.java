package view;

import model.Book;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Book [] b = new Book[2];
		Scanner scr = new Scanner(System.in);
		
		for(int i = 0; i < b.length; i++) {
			System.out.println("책 제목과 저자 입력 >>(띄어쓰기로 구분) ");
			String title = scr.next();
			String author = scr.next();
			b[i] = new Book(title, author);
		}
		
		//책 리스트 출력
		for(int i = 0; i < b.length; i++) {
			System.out.println("(" + b[i].getTitle() + "," +  b[i].getAuthor() + ")");
		}	
	scr.close();
	}

}
