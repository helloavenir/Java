package inaterface;

public class LGPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("�츮�� �츮�� LG");// TODO Auto-generated method stub

	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�޾ƿ� LG");

	}
	
	public void flash() {
		System.out.println("��ȭ�� �� ��¦��¦");
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
