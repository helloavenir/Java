package arrayListEx;

public class Student {
	//필드 이름, 전화번호, 주소
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
		//이름: name, 전화변호: phone
		return " 이름: " + name + ", 전화번호; " + phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		//obj와 내자신(객체)의 이름이 같다면 같은 객체이다라고 오버라이드
		Student temp = (Student)obj;
		if(this.name.equals(temp.name))
			return true;
		else return false;
	}
	
    
    
}
