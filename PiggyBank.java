package piggyBank;

class PiggyBank {
	private int money;

	
	PiggyBank(){
		money = 0;
	}
	
	PiggyBank(int m) {
		money = m;
	}
	
	public void deposit(int m) {
		money += m;	
		System.out.println(m + "원 예금");
	}
	
	public void withdraw(int m) {
		money -= m;	
		System.out.println(m + "원 인출");
	}
	
	public void balance() {
		System.out.println(money + "원 남음");		
	}
}
