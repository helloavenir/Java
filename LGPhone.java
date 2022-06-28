package inaterface;

public class LGPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띠리링 띠리링 LG");// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall() {
		System.out.println("전화받아요 LG");

	}
	
	public void flash() {
		System.out.println("전화기 불 반짝반짝");
	}
	

	public static void main(String[] args) {
		LGPhone lg = new LGPhone();
		System.out.println(LGPhone.TIMEOUT);
		
		lg.printgo();
		lg.sendCall();
		lg.receiveCall();
		lg.flash();
	}

}
