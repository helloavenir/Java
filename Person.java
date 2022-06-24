package inheritance;

public class Person {
	public String name;
	public int age;
	protected int height;
	private int weight;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("talk talk");
	}
	
	public void eat() {
		System.out.println("�ȳ�");
	}
	
	public void walk() {
		System.out.println("�ѹ��ѹ�");
	}
	
	public void sleep() {
		System.out.println("����");
	}
	
	public Person() {
	}
	
	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
}
