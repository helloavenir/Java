package model;

public class PhoneBook {
	Scanner scr;
	Phone [] phones;
	//생성자 Scanner 객체 생성

	//메소드 read() search()
	
	//read() 이름과 전화번호를 읽어서 Phone 객체에 저장
	//객체 배열 크기를 입력받음 size
	phones = new Phone[size];
	for(int i = 0; i < phones.length; i++) {
		//이름, 전화번호 읽기
	phones[i] = new Phone(이름, 전화번호);
	}	
	//이름을 받아 전화번호 검색 
	String search(String name) { 
		for (int i =0; i < phones.length; i++)
			if (name.equals(phones.getName())
					return phones[i].getTel();
			else return null;
			
			

}
