package view;

import model.PiggyBank;

public class PiggyBankApp {

	public static void main(String[] args) {
		//�����ڰ� Ŭ������ �ϳ��� ������ �⺻������ ������ ������ ����
		PiggyBank pb1 = new PiggyBank();
		//��ü �ʱ�ȭ�� ���� �����ָ�, �ʵ�� ��� 0���� ���´�.
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
