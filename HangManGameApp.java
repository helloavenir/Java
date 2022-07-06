package game;

import java.util.*;
import java.io.*;

public class HangManGameApp {
	private final int HIDDENCHAR = 2; // 숨기는 글자 개수
	private StringBuffer hiddenWord; // 숨긴 글자를 가진 단어
	private String newWord; // 게임을 위해 선정된 단어
	private Scanner scanner; // 키 입력
	private int failCount; // 틀린 횟수
	
	public HangManGameApp() { 
		scanner = new Scanner(System.in);
	}

	// 게임을 시작하는 메소드
	public void run() {
		System.out.println("지금부터 행맨 개임을 시작합니다.");
		Words words = new Words("words_level1.txt"); // words.txt 파일의 모든 단어를 읽어 벡터에 저장한다.		
		while(true) {
			newWord = words.getRandomWord(); // 랜덤한 단어 선택
			if(newWord == null) break; // 단어 선택에 문제가 있는 경우 프로그램 종료
			makeHidden(); // 2개의 글자를 숨긴 단어 만들기
			go(); // 게임 진행
			System.out.print("Next(y/n)?");
			String answer = scanner.next();
			if(answer.equals("n")) // n을 입력하면 종료
				break;
		}
	}
	
	// 선택된 단어 newWord에 2 개의 글자를 숨긴 단어 hiddenWord를 만든다.
	private void makeHidden() {
		hiddenWord = new StringBuffer(newWord);
		Random r = new Random();
		
		for(int k=0; k<HIDDENCHAR; k++) {
			int index = r.nextInt(newWord.length());
			char c = newWord.charAt(index);
			for(int i=0; i<newWord.length(); i++) {
				if(hiddenWord.charAt(i) == c)
					hiddenWord.setCharAt(i,'-');
			}
		}
	}
	
	// 사용자 키를 입력받으면서 행맨 게임을 진행한다. 5 번 틀리면 종료한다.
	// 한 단어 진행 후 y/n 물음에 대해 n를 입력하면 종료한다.
	private void go() {
		failCount=0;
		char key;
		do {
			if(failCount == 5) {
				System.out.println("5번 실패 하였습니다.");
				break;
			}
			System.out.println(hiddenWord);
			System.out.print(">>");
			String text = scanner.next();
			key =  text.charAt(0);
		}while(!complete(key));
		System.out.println(newWord);
	}
	
	// 사용자가 입력한 문자 key가 숨긴 글자와 일치하는지 검사하고 일치하면 true를 리턴한다.
	// 그리고 나서 hiddenWord의 '-'문자를 key 문자로 변경한다.
	private boolean complete(char key) {
		boolean hit = false;
		for(int i=0; i<newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '-' && newWord.charAt(i) == key) {
				hiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		if(!hit)
			failCount++;
		for(int i=0; i<newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '-')
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		HangManGameApp app = new HangManGameApp();
		app.run();
	}

}


