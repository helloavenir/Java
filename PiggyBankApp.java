package view;

import model.PiggyBank;

public class PiggyBankApp {

	public static void main(String[] args) {
		//생성자가 클래스에 하나라도 있으면 기본생성자 생성은 생기지 않음
		PiggyBank pb1 = new PiggyBank();
		//객체 초기화를 따로 안해주면, 필드는 모두 0값을 갖는다.
		pb1.showMoney();
		pb1.deposit(10000);
		pb1.showMoney();
		pb1.withdraw(1000);
		pb1.showMoney();
		
		pb1.withdraw(10000);
		
		
		PiggyBank pb2 = new PiggyBank(10000);
		
		pb2.showMoney();
		
		// TODO Auto-generated method stub

	}

}
