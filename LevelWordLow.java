package gameProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
//low level 단어 추출
public class LevelWordLow extends Words implements InterfaceLevel{
	
	public LevelWordLow() {
		super();
		loadFile();		
	}
	
	//숨겨진 문제 문자 만들기
	public StringBuffer makeHidden(String sNewWord) {
		StringBuffer sbHiddenWord = new StringBuffer(sNewWord);		
		Random r = new Random();
					
		int index = r.nextInt(sNewWord.length());				
		char cHiddenChar = sNewWord.charAt(index); //숨겨진 문자
		
		//'-'로 숨기기					
		for(int j=0; j<sNewWord.length(); j++) {
			if(sbHiddenWord.charAt(j) == cHiddenChar)
				sbHiddenWord.setCharAt(j,'-');
		}	
		return sbHiddenWord;		
	}
	
/********************* private ********************************************/
 //파일에서 low level 단어 추출하여 Words 클래스에 있는 ArrayList 에 저장
	private void loadFile(){	//level: easy(0), normal(1), hard(2)
		String word;
		int numChar;
		String fileName = "reWords.txt";
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			
			while(scanner.hasNext()) { 
				word = scanner.nextLine();
				numChar = getNumChar(word);
				// 문자길이 5 이상 & 서로 다른 문자 4 미만
				if((numChar<4 && word.length()>5) )
					wordVector.add(word); 				
			}			
			scanner.close();
		}	
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	}	
}
