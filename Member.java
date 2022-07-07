package gameProject;

public class Member {
	private String sID;
	private String sPW;
	private int iLevel;
	private int iTotalScore;
	
	public Member(String sID, String sPW, int iLevel, int iTotalScore) {	
		this.sID = sID;
		this.sPW = sPW;
		this.iLevel = iLevel;
		this.iTotalScore = iTotalScore;
	}
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
	
	void setiLevel(int iLevel) {
		this.iLevel = iLevel;
	}
	void setiTotalScore(int iTotalScore) {
		this.iTotalScore = iTotalScore;
	}
	@Override
	public String toString() {
		
		return sID + "," + sPW + "," + iLevel + "," + iTotalScore;
	}
	
	
	
}
