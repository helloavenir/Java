package inaterface;

public class SamsungPhone implements PhoneInterface {
	
	
	@Override
	public void sendCall() {
		System.out.println("������ ������ Samsung");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�޾ƿ� Samsung");
	}

	public static void main(String[] args) {
		System.out.println(SamsungPhone.TIMEOUT);
		//static �޼ҵ�, ������ Ŭ�����̸����� �ۼ� ����
		SamsungPhone sp = new SamsungPhone();
		sp.sendCall();
		sp.receiveCall();
		sp.printgo();
	}
	
}
