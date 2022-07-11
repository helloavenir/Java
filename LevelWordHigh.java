package gameProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
//high level 게임
public class LevelWordHigh extends Words implements InterfaceLevel{
	public LevelWordHigh() {
		super();
		loadFile();		
	}	
	
	//숨겨진 문제 문자 만들기
	public StringBuffer makeHidden(String sNewWord) {
		StringBuffer sbHiddenWord = new StringBuffer(sNewWord);		
		Random r = new Random();
		
		// GAME_LEVEL_HARD 일 경우		
		int index = r.nextInt(sNewWord.length());
		char cHiddenChar =  sNewWord.charAt(index);
		
		for(int j=0; j<sNewWord.length(); j++) {
			if(sbHiddenWord.charAt(j) != cHiddenChar)
				sbHiddenWord.setCharAt(j,'-');										
		}
		return sbHiddenWord;
	}
	
/********************* 	private **********************************************/
	//파일에서 high level 단어 추출하여 Words 클래스에 있는 ArrayList 에 저장
	private void loadFile(){	//level: easy(0), normal(1), hard(2)
		String word;
		int numChar;
		String fileName = "reWords.txt";
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));			
			while(scanner.hasNext()) { // 파일 끝까지 읽음
				word = scanner.nextLine(); // 한 라인을 읽고 '\n'을 버린 나머지 문자열만 리턴
				numChar = getNumChar(word);
				// 문자길이가 7초과 & 서로 다른 문자가 5개 이상
				if((word.length()>7 &&  numChar>5) || (word.length()<5 && numChar>4))
					wordVector.add(word); // 문자열을 벡터에 저장	
			}			
			
			scanner.close();
		}	
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	}

}
