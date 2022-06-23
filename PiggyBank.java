package model;

public class PiggyBank {
	//필드: 저금통 금액 저장
	int money;
	//빈 돼지저금통 생성
	public PiggyBank() {
		
	}
	
	//사용자가 입금한 금액이 들어있는 돼지저금통 생성
	public PiggyBank(int money) {
		this.money = money;
	}
	
	//예금
	public void deposit(int money) {
		this.money += money;		
	}
	//인출
	public void withdraw(int money) {
		if(this.money >= money)
			this.money -= money;
		else System.out.println("잔액은 " + this.money + "원 입니다.");
	}
	//잔고 출력
	public void showMoney() {
		System.out.println("남은 돈: "+ money + "원 입니다.");
	}
}
