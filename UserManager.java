package gameProject;

import java.util.Scanner;

public class UserManager {
    private static Scanner scanner;
    private JoinMemberManager joinMember;
    private Member userLogin;
   
    public int getUserTotalScore() {
		return userLogin.getiTotalScore();
	}
    public int getUserLevel() {
		return userLogin.getiLevel();
	}
    public void setUserTotalScore(int score) {
		userLogin.setiTotalScore(score);
	}
    public void setUserLevel(int level) {
		userLogin.setiLevel(level);
	}
    
	
    // JoinMemberManager 생성자 
    public UserManager() {
    	scanner = new Scanner(System.in); 
    	joinMember = new JoinMemberManager("memberList.txt");    	
	}
    
    public void close(){
    	//joinMember.setMember(userLogin.getsID(), userLogin.getsPW(), 
    		//	userLogin.getiLevel(), userLogin.getiTotalScore());
    	joinMember.close();
		scanner.close();
	}
   
	//메뉴 출력 메소드
    private int display() {
        System.out.println("1. 로그인   2. 회원 가입   ");
        System.out.print(">>>");
        return scanner.nextInt();
    }
    
    //회원가입 메소드
    private boolean join() {
        while(true) {
            System.out.print("가입 id >> ");
            String newId = scanner.next();
            if(joinMember.isMember(newId)) {
                System.out.println("이미 존재하는 아이디 입니다.");
                continue;
            }
            System.out.print("가입 pw >> ");
            String newPwd = scanner.next();
          
            joinMember.setMember(newId, newPwd, 0, 0);
            System.out.println("저장 완료!!");
            break;
        }  
        return true;
    } 
    // 같은 멤버가 있는지 체크하는 메소드
    private boolean isMemberCheck(String id, String pw) {    
    	boolean bFlag = false;
    
        if (joinMember.isMember(id)) {
        	Member temp = joinMember.getMember(id);
        	
            if (!temp.getsPW().equals(pw)) {
                System.out.println("비밀번호가 맞지 않습니다. 인증 실패");
            } else {
                System.out.println("인증 성공!!");
            	userLogin = temp;
                bFlag = true;
            }
        } else {
            System.out.println("존재하지 않는 아이디 입니다.");
        }
        return bFlag;
    }
    // 로그인 메소드
    private void login() {
    	while(true) {
            System.out.print("아이디 입력 >> ");
            String myId = scanner.next();
            System.out.print("비밀번호 입력 >> ");
            String myPw = scanner.next();
            if(isMemberCheck(myId, myPw)) { 
            	break;
            }
    	}         	
    }
    //  멤버 메뉴 메소드(1. 로그인   2. 회원 가입 ) 
    public void userLogin() {
        int select = display();
        
        if(select == 1) {   
        	login();        	                
        }
        else if(select == 2) {        
            if(join())
            	login(); 
        }
        else {  
            System.out.println("잘못된 값 입력");              
        }
    }
}



