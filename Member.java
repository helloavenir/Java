package gameProject;

public class Member {
	private String sID;	//ID
	private String sPW;	//PW
	private int iLevel;	//level
	private int iTotalScore;	//총점
	
	public Member(String sID, String sPW, int iLevel, int iTotalScore) {	
		this.sID = sID;	//ID
		this.sPW = sPW;	//password
		this.iLevel = iLevel;	//level
		this.iTotalScore = iTotalScore;	//총점
	}
	
	public Member() {
		
	}
	//getter
	String getsID() {
		return sID;
	}
	String getsPW() {
		return sPW;
	}
	
	int getiLevel() {
		return iLevel;
	}
	int getiTotalScore() {
		return iTotalScore;
	}
	//setter
	void setMember(Member m) {
		this.sID = m.sID;	//ID
		this.sPW = m.sPW;	//password
		this.iLevel = m.iLevel;	//level
		this.iTotalScore = m.iTotalScore;	//총점
	}
	void setiLevel(int iLevel) {
		this.iLevel = iLevel;
	}
	void setiTotalScore(int iTotalScore) {
		this.iTotalScore = iTotalScore;
	}
	void setsID(String sID) {
		this.sID = sID;
	}

	void setsPW(String sPW) {
		this.sPW = sPW;
	}

	@Override
	public String toString() {		
		return sID + "," + sPW + "," + iLevel + "," + iTotalScore;
	}
	
	
	
}
