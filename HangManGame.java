package gameProject;

import java.util.InputMismatchException;

import java.util.Scanner;
//게임 진행 : UserManager 을 상속받아 유저가 게임을 진행하는 클래스
public class HangManGame extends UserManager{
	private static final int LEVEL_HIGHT = 2;	// hight level
	private static final int LEVEL_NORMAL = 1;	// normal level 
	private static final int LEVEL_LOW = 0;		// low level
	
	private StringBuffer sbHiddenWord; // 숨긴 글자를 가진 단어
	private String sNewWord; 			// 게임을 위해 선정된 단어	
	private static final int GAME_COUNT = 5;	//게임 회수
	private int iFailCount; 	// 틀린 횟수
	private Object word;				//난이도에 따라 다른 클래스를 생성
	
	//HangManGame 생성자
	public HangManGame() { 
		super();
		super.userLogin();
		UserManager.scanner = new Scanner(System.in);			
	}
	//scanner close 메소드
	public void close(){
		super.close();
	}
	// 게임 시작 : 메인 메뉴 [1. 계속 2. 종료]
	public void startGame() {
		int menu = 0;		
		//메인 메뉴 [1. 계속 2. 종료]
		while(menu!=2){	
			System.out.println("메뉴 [1. 계속 2. 종료]");
			menu = input();	
			if(menu == 1) {
				System.out.println("*** 영단어 빈문자 맞추기 ***");
				runGame();
			}				
		}	
		System.out.println("게임 종료!!");
	}
	
/****************** private *****************************/	
	//입력 메소드
	private int input() {
		return scanner.nextInt();
	}
	//게임 시도한 횟수
	private int getCount() {
		return GAME_COUNT- iFailCount;
	}
	
	//게임 레벨 입력 받아, 레벨별  클래스 초기화 
	private void gameLevelSet(){
		boolean bFlag = false;
		while(!bFlag) {
			int userLevel = super.getiLevel();
			int inputLevel;
			System.out.println("사용자 레벨 : " + userLevel);
			System.out.println("총 점수 : " + super.getiTotalScore());
			System.out.printf("레벨을 선택하세요[hard(%d)/ normal(%d)/ easy(%d)] >> ",
					LEVEL_HIGHT, LEVEL_NORMAL, LEVEL_LOW);
			try {
				inputLevel= scanner.nextInt(); 		
				if(inputLevel == LEVEL_LOW) {
					super.setiLevel(inputLevel);
					super.saveUserFild();
					word = new LevelWordLow();
					bFlag = true;
				}
				else if(inputLevel == LEVEL_NORMAL) {
					super.setiLevel(inputLevel);
					super.saveUserFild();
					word = new LevelWordNormal();
					bFlag = true;			
				
				}	
				else if(inputLevel == LEVEL_HIGHT) {
					super.setiLevel(inputLevel);
					super.saveUserFild();
					word = new LevelWordHigh();
					bFlag = true;
					
				}
				else {
					System.out.println("Input error!!\n");
				}	
			}catch(InputMismatchException e) {
				System.out.println("Input error(정수 입력)!!\n");
				System.exit(0);
			}
		}					
	}
	
	// 사용자 키를 입력받으면서 행맨 게임을 진행, 5 번 틀리면 종료
	// 한 단어 진행 후 y/n 물음에 대해 n를 입력하면 종료
	private void go() {
		iFailCount=0;
		int count = 0;
		char key;
		do {
			if(iFailCount == GAME_COUNT) {
				System.out.println(iFailCount + "번 실패 하였습니다.");
				break;
			}
			count = getCount();
			System.out.println(count + "번째 : "+ sbHiddenWord);
			System.out.print(">>");
			String text = scanner.next();
			key =  text.charAt(0);
		}while(!complete(key));
		if(iFailCount != GAME_COUNT) {
			System.out.println(count + "번째 성공: " + sNewWord);
		}
	}
	
	// 점수를 보여주고 총점 합산
	private void setTotalScore() {
		int score = getCount()*20;
		int totalScore = super.getiTotalScore() + score;
		super.saveUserFild();
		System.out.println("획득 점수 : " + score +"\n총 점수 : " + totalScore);
		super.setiTotalScore(totalScore);			
	}
	
	// 행맨게임 시작하는 메소드
	private void runGame() {		
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		gameLevelSet();	
		while(true) {
			//형 변환
			Words w = (Words)word;
			InterfaceLevel i = (InterfaceLevel)word;
			sNewWord = w.getWord();
			sbHiddenWord = i.makeHidden(sNewWord);
			
			go(); // 게임 진행
			setTotalScore();	//총점 합산
			System.out.print("Next(y/n)?");
			String answer = scanner.next();
			if(answer.toLowerCase().equals("n")) { // n을 입력하면 종료
				//System.out.println("프로그램 종료");
				break;
			}
			else if(!answer.toLowerCase().equals("y")) {
				System.out.println("입력 오류!!");
				break;
			}			
		}		
	}
	// 사용자가 입력한 문자 key가 숨긴 글자와 일치하는지 검사하고 일치하면 true를 리턴
	// 그리고 나서 hiddenWord의 '-'문자를 key 문자로 변경
	private boolean complete(char key) {
		if(!rightChar(key))
			iFailCount++;
	
		boolean bResult = false;
		if(rightAllChar())
			bResult = true;
		
		return bResult;
	}
	// 맞춘 문자 처리
	private boolean rightChar(char key){
		boolean hit = false;
		for(int i=0; i<sNewWord.length(); i++) {
			if(sbHiddenWord.charAt(i) == '-' && sNewWord.charAt(i) == key) {
				sbHiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		return hit;
	}
	// 정답 맞췄는지 확인
	private boolean rightAllChar(){
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
