package model;

public class PiggyBank {
	//�ʵ�: ������ �ݾ� ����
	int money;
	//�� ���������� ����
	public PiggyBank() {
		
	}
	
	//����ڰ� �Ա��� �ݾ��� ����ִ� ���������� ����
	public PiggyBank(int money) {
		this.money = money;
	}
	
	//����
	public void deposit(int money) {
		this.money += money;		
	}
	//����
	public void withdraw(int money) {
		if(this.money >= money)
			this.money -= money;
		else System.out.println("�ܾ��� " + this.money + "�� �Դϴ�.");
	}
	//�ܰ� ���
	public void showMoney() {
		System.out.println("���� ��: "+ money + "�� �Դϴ�.");
	}
}
