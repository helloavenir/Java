package inaterface;

public class SamsungPhone implements PhoneInterface {
	
	
	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉 Samsung");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화받아요 Samsung");
	}

	public static void main(String[] args) {
		System.out.println(SamsungPhone.TIMEOUT);
		//static 메소드, 변수는 클래스이름으로 작성 권장
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.printgo();
	}
	
}
