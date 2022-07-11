package gameProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
//normal level 게임
public class LevelWordNormal extends Words implements InterfaceLevel{
	private static final int NUM_HIDDEN_CHAR = 3;	//숨긴 문자 갯수
	
	public LevelWordNormal() {
		super();
		loadFile();		
	}
	
	//숨겨진 문제 문자 만들기
	public StringBuffer makeHidden(String sNewWord) {
	 // HIGHT_LEVEL_HIDDENCHAR or LOW_LEVEL_HIDDENCHAR 일 경우
		StringBuffer sbHiddenWord = new StringBuffer(sNewWord);		
		Random r = new Random();
		char[] cHiddenChar = new char[NUM_HIDDEN_CHAR];			//숨겨진 문자
		
		int index = r.nextInt(sNewWord.length());				
		cHiddenChar[0] = sNewWord.charAt(index);
		
		for(int k=1; k<NUM_HIDDEN_CHAR; k++) {
			index = r.nextInt(sNewWord.length());				
			cHiddenChar[k] = sNewWord.charAt(index);
		
			//숨기는 문자가 서로 다른지 확인			
			boolean bCharEqual = false;
			int i = 0;
			while(i<k) {
				if(cHiddenChar[i] == cHiddenChar[k]){	
					bCharEqual = true;
					break;
				}
				i++;
			}			
			if(bCharEqual) {
				k--;		
			}				
		}
		//'-'로 숨기기					
		for(int j=0; j<sNewWord.length(); j++) {
			if(sbHiddenWord.charAt(j) == cHiddenChar[0] || sbHiddenWord.charAt(j) == cHiddenChar[1])
				sbHiddenWord.setCharAt(j,'-');
		}	
		return sbHiddenWord;		
	}
	
/***************** 	private   ***********************************************/
	//파일에서 normal level 단어 추출하여 Words 클래스에 있는 ArrayList 에 저장
	private void loadFile() {	
		String word;
		int numChar;
		String fileName = "reWords.txt";
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));
			
			while(scanner.hasNext()) { 
				word = scanner.nextLine(); 
				numChar = getNumChar(word);
				// 문자길이가 7 미만 & 서로 다른 문자 3개 초과
				if((word.length()<7 && numChar>3) || word.length()>7)
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
