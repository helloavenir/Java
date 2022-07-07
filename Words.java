package gameProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

//words.txt 파일을 읽고 벡터에 저장하고 벡터로부터 랜덤하게 단어를 추출하는 클래스
class Words {
	static final int GAME_LEVEL_EASY = 0;
	static final int GAME_LEVEL_NORMAL = 1;
	static final int GAME_LEVEL_HARD = 2;
	
	Vector<String> wordVector = new Vector<String>();
	
	//파일명, 레벨 받아 Words 생성자
	public Words(String fileName, int level){	//level: easy(0), normal(1), hard(2)
		String word;
		int numChar;
		
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			if(level == GAME_LEVEL_HARD) {//hard
				while(scanner.hasNext()) { // 파일 끝까지 읽음
					word = scanner.nextLine(); // 한 라인을 읽고 '\n'을 버린 나머지 문자열만 리턴
					numChar = getNumChar(word);
					// 문자길이가 7초과 & 서로 다른 문자가 5개 이상
					if((word.length()>7 &&  numChar>5) || (word.length()<5 && numChar>4))
						wordVector.add(word); // 문자열을 벡터에 저장	
				}
			}
			else if (level == GAME_LEVEL_NORMAL) {//normal
				while(scanner.hasNext()) { 
					word = scanner.nextLine(); 
					numChar = getNumChar(word);
					// 문자길이가 7 미만 & 서로 다른 문자 3개 초과
					if((word.length()<7 && numChar>3) || word.length()>7)
						wordVector.add(word); 					
				}				
			}
			else if(level == GAME_LEVEL_EASY) {//easy
				while(scanner.hasNext()) { 
					word = scanner.nextLine();
					numChar = getNumChar(word);
					// 문자길이 5 이상 & 서로 다른 문자 4 미만
					if((numChar<4 && word.length()>5) )
						wordVector.add(word); 				
				}
			}
			scanner.close();
		}
	
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	
	}

	//문자열 중 서로 다른 문자가 몇개인지 리턴 메소드
	private int getNumChar(String word) {
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
	// 임의 문자 추출 메소드
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // 총 단어의 개수
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}
	
}