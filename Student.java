package arrayListEx;

public class Student {
	//�ʵ� �̸�, ��ȭ��ȣ, �ּ�
    private String name;
    private String phone;
    private String addr;
	public Student(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
	}
	@Override
	public String toString() {
		//�̸�: name, ��ȭ��ȣ: phone
		return " �̸�: " + name + ", ��ȭ��ȣ; " + phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj�� ���ڽ�(��ü)�� �̸��� ���ٸ� ���� ��ü�̴ٶ�� �������̵�
		Student temp = (Student)obj;
		if(this.name.equals(temp.name))
			return true;
		else return false;
	}
	
    
    
}
