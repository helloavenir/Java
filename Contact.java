package model;

public class Contact {
	private String name;
	private int age;
	private String phoneNumber;
	public Contact(String name, int age, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void showInfo() {
		System.out.println("�̸�: " + name + " / ����: " + age + "(��) / ����ó: " + phoneNumber);
	}

}


