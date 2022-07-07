package gameProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class JoinMemberManager {
	private ArrayList <Member> aMemberTable = new ArrayList<Member>();
	private String fileName;
	
	//JoinMember 생성자
	public JoinMemberManager(String file){
		fileName = file;
		memberLoadFile();
	}
	public void close() {
		memberWriteFile();		
	}
	//aMemberTable에 멤버정보 set 메소드
	
	public void setMember(String newId, String newPwd, int iLevel, int iScore){
		aMemberTable.add(new Member(newId, newPwd, iLevel, iScore));
	}
	
	//aMemberTable에서 ID로 검색하여 Member 리턴
	public Member getMember(String id){
		Member mTemp = new Member("", "",0,0);
		
		for(int i=0; i<aMemberTable.size(); i++) {
			mTemp = aMemberTable.get(i);
			if(mTemp.getsID().equals(id))
				break;
		}
		return mTemp;
	}
	
	
	//aMemberTable에 ID로 가입된 아이디인지 검색 메소드
	public boolean isMember(String newId){
		Member mTemp = new Member("", "",0,0);
		
		boolean bReturn = false;
		for(int i=0; i<aMemberTable.size(); i++) {
			mTemp = aMemberTable.get(i);
			if(mTemp.getsID().equals(newId)) {
				bReturn= true;
				break;
			}
		}
		return bReturn;
	}
	//파일에서 멤버 정보 읽어와 aMemberTable에 저장 메소드
	private void memberLoadFile() {
		try {
			Scanner scanner = new Scanner(new FileReader(fileName));			
			while(scanner.hasNext()) { // 파일 끝까지 읽음
				String word = scanner.next(); // 한 라인을 읽고 '\n'을 버린 나머지 문자열만 리턴
				String [] member = word.split(",");
				Member temp = new Member(member[0], member[1], Integer.parseInt(member[2]), Integer.parseInt(member[3]));
				aMemberTable.add(temp);				
				//System.out.println(temp);
			}
			scanner.close();
		}	
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}	   
	}
	private void memberWriteFile(){
		File file = new File(fileName);
		
		if(deleteFile(file)) {
			try {
				//FileWriter 이용한 파일 쓰기
				FileWriter fw = new FileWriter(file);
				for(int i=0; i<aMemberTable.size(); i++) {
					Member temp = aMemberTable.get(i);				
					fw.write(temp.toString() + "\n"); 
				}			
				fw.flush();   //flush() 호출해야 파일로 전송되어 저장됨
				fw.close();
				System.out.println("file writting!!");
			}catch(IOException e) {
				System.out.println("<file not found error>");
				System.exit(0);
			}	
		}
	}
	private boolean deleteFile(File file) {		
		boolean bReturn = false;
		
		//파일 존재 여부 확인 후 없을 경우에만 파일 쓰기 진행
		if( file.exists() ){
    		if(file.delete()){
    			//System.out.println("파일삭제 성공");
    			bReturn = true;
    		}else{
    			//System.out.println("파일삭제 실패");
    			bReturn = false;
    		}
    	}else{
    		//System.out.println("파일이 존재하지 않습니다.");
    		bReturn = true;
    	}
		return bReturn;
	}
}
