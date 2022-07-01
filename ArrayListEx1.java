package arrayListEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		//과일목록 생성 arraylist 이용
		ArrayList <String> fr = new ArrayList<String>();
		System.out.println(fr.size());
		//과일 추가 add(obj)
		fr.add("apple");
		fr.add("banana");
		fr.add("cherry");
		fr.add("mango");
		System.out.println(fr.size());
		
		//과일 목록 추가 add(index, obj)
		//arraylist 목록 출력 get(index)
		fr.add(1, "grape");
		for(int i = 0; i <fr.size(); i++) {
			System.out.println(fr.get(i));
		}
		System.out.println("==============");
		//for each문 (기본형: 요소)
		for(String f : fr) {
			System.out.println(f);
		}
		System.out.println("==============");
		
		System.out.println(fr);
		
		//검색하기 contains(obj)
		if(fr.contains("apple")) {
			int index = fr.indexOf("apple");
			System.out.println("과일 목록 중에 " + (index+1) + "번째 있습니다.");
		}
		else {
			System.out.println("과일 목록 중에 없습니다.");			
		}
		
		//검색 equals() 이용 
		int i;
		for(i = 0; i < fr.size(); i++) {
			if (fr.get(i).equals("cherry")) {
				System.out.println("과일 목록 중에 " + (i+1) + "번째 있습니다.");
				break;
				}
			}
		if( i == fr.size()) {
			System.out.println("과일목록 중에 cherry가 없습니다.");
		}
		
		if(fr.remove("grape")) {
			System.out.println("grape를 삭제했습니다.");
		}
		else {
			System.out.println("grape항목이 없습니다.");	
		}
		System.out.println(fr);
		
		String f = fr.remove(0);
		System.out.println(f + "삭제했습니다.");
		System.out.println(fr);
		
		//모든 항목 삭제 clear()
		fr.clear();
		System.out.println(fr.size());
		
	}

}
