package gameProject;

import java.util.InputMismatchException;

import java.util.Scanner;

public class HangManGame {
	private static final int GAME_COUNT = 5;
	private int iFailCount; // 틀린 횟수
	private static Scanner scanner; // 키 입력
	private UserManager userGame;
	private HideWord gameHideWord;
	
	//HangManGame 생성자
	public HangManGame() { 
		scanner = new Scanner(System.in);
		userGame = new UserManager();
		gameHideWord = new HideWord();
		
		userGame.userLogin();
		
	}
	//scanner close 메소드
	public void close(){
		scanner.close();
		userGame.close();
	}
	//입력 메소드
	public int input() {
		return scanner.nextInt();
	}
	private int getCount() {
		return GAME_COUNT- iFailCount;
	}
	
	//게임 레벨 입력 받아, Words 클래스 초기화 메소드
	private void gameLevelSet(){
		while(true) {
			int userLevel = userGame.getUserLevel();
			int inputLevel;
			System.out.println("사용자 레벨 : " + userLevel);
			System.out.println("총 점수 : " + userGame.getUserTotalScore());
			System.out.printf("레벨을 선택하세요[hard(%d)/ normal(%d)/ easy(%d)] >> ",
					Words.GAME_LEVEL_HARD, Words.GAME_LEVEL_NORMAL, Words.GAME_LEVEL_EASY);
			try {
				inputLevel= scanner.nextInt(); 
		
				if(inputLevel>= Words.GAME_LEVEL_EASY && inputLevel<= Words.GAME_LEVEL_HARD) {		
					gameHideWord.setWordFile(inputLevel);
					userGame.setUserLevel(inputLevel);
					break;
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
	

	// 사용자 키를 입력받으면서 행맨 게임을 진행, 7 번 틀리면 종료
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
			System.out.println(count + "번째 : "+ gameHideWord.getSbHiddenWord());
			System.out.print(">>");
			String text = scanner.next();
			key =  text.charAt(0);
		}while(!complete(key));
		if(iFailCount != GAME_COUNT) {
			System.out.println(count + "번째 성공: " +gameHideWord.getsNewWord());
		}
	}
	
	
	private void setTotalScore() {
		int score = getCount()*20;
		int totalScore = userGame.getUserTotalScore() + score;
		
		System.out.println("획득 점수 : " + score +"\n총 점수 : " + totalScore);
		userGame.setUserTotalScore(totalScore);			
	}
	// 사용자가 입력한 문자 key가 숨긴 글자와 일치하는지 검사하고 일치하면 true를 리턴
	// 그리고 나서 hiddenWord의 '-'문자를 key 문자로 변경
	public boolean complete(char key) {
		if(!gameHideWord.collectChar(key))
			iFailCount++;
	
		boolean bResult = false;
		if(gameHideWord.collectAllChar())
			bResult = true;
		
		return bResult;
	}
	// 게임 시작하는 메소드
	private void runGame() {		
		System.out.println("지금부터 행맨 게임을 시작합니다.");
		gameLevelSet();	
		while(true) {	
			gameHideWord.getWord(userGame.getUserLevel());	//문제단어 추출
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
			}
			
		}
		
	}
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
}
