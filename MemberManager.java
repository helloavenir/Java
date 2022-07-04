package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberManager {
	// 사용자가 정의한 멤버 타입이 배열에 들어감
	ArrayList <Member> members;
	
	// 매개변수 있는 생성자를 만들려고 하면, 기본 생성자는 자동 생성하지 않으므로 같이 작성
	public MemberManager() {
//		기능이 작동할 때의 데이터를 담음
//		ArrayList 생성자로 몇 명이 다뤄질지 모르는 자료를 다룸
		members = new ArrayList<Member>();
	}
	
	public boolean insert(String name, String tel, String email) {
		if (members.add(new Member(name, tel, email))) return true;
		else return false;
		
	}
	
	public String search(String name) {
		// indexOf()는 자동으로 equals()를 자동 호출해줌
		int index = members.indexOf(new Member(name, "", ""));
		if(index != 1) return members.get(index).getTel();
		else return null;

	}

//	아무 것도 없을 때를 사이즈를 체크해 -1이라는 값으로 알려주려고 void를 int로 리턴타입 바꿈
	public int printAll() {
		int size = members.size();
		if (size <= 0) return -1;
		
		// iterator 객체 이용하려면 타입 명시해줘야 함
		Iterator<Member> it = members.iterator();
		System.out.println(" 이름    전화번호       이메일");
		
		while(it.hasNext()) {
			Member member = it.next();
			System.out.println(member.getName() + "    " + member.getTel() + "   " + member.getEmail());
		}
		return size;
		
		// Member member = it.next();
		// System.out.println(member);
		// 객체 출력에 있어 toString() 를 재정의하지 않으면, 
        // 객체에 대한 해시코드, 주소가 출력된다.
		// Member 클래스에서 toString() 오버라이딩
		
		
		
	}
}


