package piggyBank;

class PiggyBankApp {

	public static void main(String[] args) {
		PiggyBank pb1 = new PiggyBank();
		PiggyBank pb2 = new PiggyBank(15000);
		
	    pb1.balance();
	    pb1.deposit(10000);
	    pb1.balance();
	    pb1.withdraw(1000);
	    pb1.balance();
	    
	    System.out.println("");
	    pb2.balance();
	    pb2.deposit(10000);
	    pb2.balance();
	    pb2.withdraw(1000);
	    pb2.balance();   
	}

}
