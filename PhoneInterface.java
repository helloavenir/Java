package inaterface;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printgo() {
		System.out.println("** Phone **");
	}
}

//�������̽��� �⺻������ �ۺ�
//�������̽��� �⺻������ abstract, ���� ��� default ����� ��
