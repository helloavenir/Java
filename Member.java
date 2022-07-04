package practice;

public class Member {
	private String name=null;
	private String tel=null;
	private String email=null;
	
	public Member(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}

	public String getTel() {
		return tel;
	}
	

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public boolean equals(Object obj) {
//		Member를 obj로 형변한해 줌, 객체비교는 개발자가 정의해줘야 함.
		Member temp = (Member)obj;		
		return this.name.equals(temp.name);
	}

	@Override
	public String toString() {		
		return name + "       " + tel + "      " + email;
	}
	
	

	
	
	
}
