package abstractEx;

public class GoodCalcApp {

	public static void main(String[] args) {
		GoodCalc gc = new GoodCalc();
		
		int sum = gc.add(2, 3);
		System.out.println("2+3="+sum);
		int sub = gc.subtract(2,  3);
		System.out.println("2-3="+sub);
		int [] array = {1, 2, 3, 4};
		double avg = gc.average(array);
		System.out.println("[1, 2, 3, 4] ЦђБе: "+avg);

	}

}


