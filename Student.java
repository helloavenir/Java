package inheritance;

public class Student extends Person {
	int year;

	public void study() {
		System.out.println("���� ��");
	}
	
	public Student() {
	}
	
	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
		// TODO Auto-generated constructor stub
	}
}
