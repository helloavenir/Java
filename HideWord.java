package gameProject;

import java.util.Random;

public class HideWord {
	private static final int HIGHT_LEVEL_HIDDENCHAR = 3;
	private static final int LOW_LEVEL_HIDDENCHAR =1;
	
	private StringBuffer sbHiddenWord; // 숨긴 글자를 가진 단어
	private String sNewWord; // 게임을 위해 선정된 단어		
	private Words words;
	
	String getsNewWord() {
		return sNewWord;
	}
	StringBuffer getSbHiddenWord() {
		return sbHiddenWord;
	}
	// 선택된 단어 newWord에 n개의 글자를 숨긴 단어 hiddenWord 생성 메소드
	private void makeHidden(int numHiddenChar) {
		sbHiddenWord = new StringBuffer(sNewWord);		
		System.out.println(sbHiddenWord);
		Random r = new Random();
		
		// GAME_LEVEL_HARD 일 경우
		if(numHiddenChar == sNewWord.length()-1) {
			int index = r.nextInt(sNewWord.length());
			char cHiddenChar =  sNewWord.charAt(index);
			
			for(int j=0; j<sNewWord.length(); j++) {
				if(sbHiddenWord.charAt(j) != cHiddenChar)
					sbHiddenWord.setCharAt(j,'-');
			}							
		}
		else { // HIGHT_LEVEL_HIDDENCHAR or LOW_LEVEL_HIDDENCHAR 일 경우
			char[] cHiddenChar = new char[numHiddenChar];			//숨겨진 문자
			for(int k=0; k<numHiddenChar; k++) {
				int index = r.nextInt(sNewWord.length());				
				cHiddenChar[k] = sNewWord.charAt(index);
			
				//숨기는 문자가 서로 다른지 확인			
				boolean bCharEqual = false;
				int i = 0;
				while(i<k && bCharEqual == false) {
					if(cHiddenChar[i] == cHiddenChar[k]){	
						bCharEqual = true;
					}
					i++;
				}
				//'-'로 숨기기
				if(bCharEqual == false) {				
					for(int j=0; j<sNewWord.length(); j++) {
						if(sbHiddenWord.charAt(j) == cHiddenChar[k])
							sbHiddenWord.setCharAt(j,'-');
					}				
				}
				else {
					k--;		
				}				
			}
		}
	}
	
	// 하나의 단어를 임의로 골라, n개의 문자를 숨긴 단어 만들기 메소드
	public void getWord(int userLevel ){
		sNewWord = words.getRandomWord(); // 랜덤한 단어 선택
		//System.out.println();
		if(sNewWord == null) 
			return; // 단어 선택에 문제가 있는 경우 프로그램 종료
		
		int numHiddenchar = 0;
		switch(userLevel) {
		case Words.GAME_LEVEL_HARD:
			numHiddenchar = sNewWord.length()-1; // 모든 문자를 숨긴 단어 만들기
			break;
		case Words.GAME_LEVEL_NORMAL:
			numHiddenchar = HIGHT_LEVEL_HIDDENCHAR; // 3개의 문자를 숨긴 단어 만들기
			break;
		case Words.GAME_LEVEL_EASY:
			numHiddenchar = LOW_LEVEL_HIDDENCHAR; // 2개의 문자를 숨긴 단어 만들기
			break;					
		default:
			System.out.println("입력 오류!!");	
			break;
		}
		makeHidden(numHiddenchar); // 레벨별 n개의 문자를 숨긴 단어 만들기
	}
		
	
	public void setWordFile(int inputLevel){
		String fileName = "reWords.txt";
		words = new Words(fileName, inputLevel);
	}			
	public boolean collectChar(char key){
		boolean hit = false;
		for(int i=0; i<sNewWord.length(); i++) {
			if(sbHiddenWord.charAt(i) == '-' && sNewWord.charAt(i) == key) {
				sbHiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		return hit;
	}
	public boolean collectAllChar(){
		boolean bResult = true;
		for(int i=0; i<sNewWord.length(); i++) {
			if(sbHiddenWord.charAt(i) == '-') {
				bResult = false;
				break;
			}
		}
		return bResult;
	}
}
