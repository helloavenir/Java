package gameProject;

import java.util.ArrayList;
import java.util.Vector;

//words.txt 파일을 읽어 선택된 레벨에 맞는 단어들을 Vector<String>에 저장하고, 
//랜덤하게 단어를 추출하는 클래스
class Words {
	Vector<String> wordVector = new Vector<String>();
	
	//파일명, 레벨 받는 Words 생성자
	public Words(){
		
	}

	// 임의 문자 추출 메소드
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // 총 단어의 개수
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}
	
	//문자열 중 서로 다른 문자가 몇개인지 리턴 메소드
	public int getNumChar(String word) {
		ArrayList <Integer> aIndexChar = new ArrayList<Integer>();
		
		aIndexChar.add(word.codePointAt(0));
		
		for(int i=1;i<word.length();i++) {			
			int c =word.codePointAt(i);			
			boolean bBreak = false;
			int j=0;
			while(bBreak == false && j<aIndexChar.size()) {
				if(aIndexChar.get(j) == c ) {						
					bBreak = true;					
				}
				j++;
			}	
			if(bBreak == false)
				aIndexChar.add(c);
		}		
		return aIndexChar.size();		
	}
	//임의 단어 추출
	public String getWord(){
		String sNewWord = getRandomWord(); // 랜덤한 단어 선택
		//System.out.println();
		if(sNewWord == null) {
			System.out.println("단어 추출 할 수 없습니다.");
			return null; // 단어 선택에 문제가 있는 경우 프로그램 종료
		}
		return sNewWord;		
	}	
}