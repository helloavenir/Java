package gameProject;

import java.util.Scanner;
//JoinMembersManager 클래스 생성
//로그인 한 사용자의 정보를 관리, 처리하는 클래스
public class UserManager extends Member {
    protected static Scanner scanner;
    private MembersJoinManager joinMembers;	//가입된 회원들의 정보
    
    // UserManager 생성자 
    public UserManager()  {
    	super();
    	scanner = new Scanner(System.in); 
    	joinMembers = new MembersJoinManager("memberList.txt");    	
	}
    //close
    public void close(){
    	saveUserFild();
    	scanner.close();
    	joinMembers.close();		
	}
    //회원 정보 저장
    public void saveUserFild() {
    	joinMembers.saveMember(super.getsID(), super.getsPW(), super.getiLevel(), super.getiTotalScore());
    }
    //  메인 메뉴 선택
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
    
 /***************    private *****************************************************/
   
	//메뉴 출력 메소드(1. 로그인   2. 회원 가입)
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
            if(joinMembers.isMember(newId)) {
                System.out.println("이미 존재하는 아이디 입니다.");
                continue;
            }
            System.out.print("가입 pw >> ");
            String newPwd = scanner.next();
          
            joinMembers.addMember(newId, newPwd, 0, 0);
            System.out.println("저장 완료!!");
            break;
        }  
        return true;
    } 
    // 같은 멤버가 있는지 체크하는 메소드
    private boolean isMemberCheck(String id, String pw) {    
    	boolean bFlag = false;
    
        if (joinMembers.isMember(id)) {
        	Member temp = joinMembers.getMember(id);
        	
            if (!temp.getsPW().equals(pw)) {
                System.out.println("비밀번호가 맞지 않습니다. 인증 실패");
            } else {
                System.out.println("인증 성공!!");
            	super.setMember(temp);
                bFlag = true;
            }
        } else {
            System.out.println("존재하지 않는 아이디 입니다.");
        }
        return bFlag;
    }
    // 아이디, 비밀번호 입력 받아 로그인 처리	
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
}



