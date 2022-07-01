package arrayListEx;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList <Student> sts = new ArrayList <>();
		
		//학생정보 삽입
//		Student st = new Student("홍길순", "010-1234-5678", "서울시 강서구");
//		sts.add(st);
		sts.add(new Student("홍길순", "010-1234-5678", "서울시 강서구"));
		sts.add(new Student("혜리", "010-2347-5678", "서울시 동작구"));
		sts.add(new Student("왕조위", "010-9080-3678", "서울시 서초구"));
		sts.add(new Student("해밀턴", "010-3454-5978", "경기도 일산"));
		
		System.out.println(sts.size());
		
		//학생정보 출력
		for(int i = 0; i < sts.size(); i++) {
			System.out.println(sts.get(i));   // print()에  객체명을 전달하면 자동으로 toString()
		}
		
		//for-each문 출력
		for(Student st : sts) {
			System.out.println(st);
			
		}
		
		//학생정보 검색
//		sts.contains(obj);
		Student temp = new Student("혜리","","");
		if(sts.contains(temp)) {
			int index = sts.indexOf(temp);
			System.out.println("혜리 전화번호: " + sts.get(index).getPhone());
		}
		
		//equals() 이용한 학생정보 검색 
		int i;
		for(i = 0; i < sts.size(); i++) {
			// Student st = sts.get(i);
			//Student temp = new Student("혜리","","");
			//st.equals(temp);
			//equals 오버라이드에서
			//객체로 받아오기로 했으므로 
			// 위에 세 문장을 new Student(이름, 무시해, 무시해)형태로 만들어 넘겨줌
			if(sts.get(i).equals(new Student("혜리","",""))) {
				String tel = sts.get(i).getPhone();
			    System.out.println("혜리 전화번호: " + tel);
			    break;
		    }
		        
	     }
		if(i == sts.size()) System.out.println("찾는 정보가 없습니다.");
		
		
		// 학생정보 삭제
		if(sts.remove(temp)) {
			System.out.println("혜리 정보 삭제 되었습니다.");
		}
		else {
			System.out.println("찾는 정보가 없습니다.");
		}
			
		//목록 전체 삭제
		sts.clear();
		System.out.println(sts.size() + "개의 정보가 남았습니다.");	
		
	}

}
