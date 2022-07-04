package practice;

import java.util.Scanner;

public class MemberManagerApp {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
//		MemberManager에서 사용할 객체를 생성
		MemberManager memberManager = new MemberManager();
		
		while (true) {
		System.out.println("*** 회원 정보 관리 프로그램 ***");
		System.out.println("메뉴 [1] 추가 [2] 삭제 [3] 츨력 [4] 종료 >> ");	
		int menu = scn.nextInt();
		if (menu == 4) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		if (menu == 1) {
		System.out.println("전화번호 추가를 선택했습니다.");
	    // insert(); name, tel, email
		System.out.println("이름 >> ");
		String name = scn.next();
		System.out.println("전화번호 >> ");
		String tel = scn.next();
		System.out.println("이메일 >> ");
		String email = scn.next();
		
		if (memberManager.insert(name, tel, email)) {
			System.out.println(name + " " + tel + " " + email);
		}
		else System.out.println("등록 실패");
		}
		else if (menu == 2) {
			System.out.println("전화번호 검색을 선택했습니다.");
			System.out.println("이름을 입력하세요 >> ");
			String name = scn.next();
            String tel = memberManager.search(name);
            if (tel != null) {
            	System.out.println(name + " 님의 전화번호는 " + tel + " 입니다.");            
            }
            else System.out.println("검색한 정보가 없습니다.");
		}	
		else if (menu == 3) {
			System.out.println("전화번호 출력을 선택했습니다.");
			int size = memberManager.printAll();
			// 출력할 내용이 없을 때 피드백 내용 추가
			if (size == -1) {
				System.out.println("출력할 정보가 없습니다.");
			}

		}
		}
	}

}
