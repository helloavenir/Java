package model;

public class PhoneBook {
	Scanner scr;
	Phone [] phones;
	//������ Scanner ��ü ����

	//�޼ҵ� read() search()
	
	//read() �̸��� ��ȭ��ȣ�� �о Phone ��ü�� ����
	//��ü �迭 ũ�⸦ �Է¹��� size
	phones = new Phone[size];
	for(int i = 0; i < phones.length; i++) {
		//�̸�, ��ȭ��ȣ �б�
	phones[i] = new Phone(�̸�, ��ȭ��ȣ);
	}	
	//�̸��� �޾� ��ȭ��ȣ �˻� 
	String search(String name) { 
		for (int i =0; i < phones.length; i++)
			if (name.equals(phones.getName())
					return phones[i].getTel();
			else return null;
			
			

}
