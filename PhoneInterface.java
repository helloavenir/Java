package inaterface;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printgo() {
		System.out.println("** Phone **");
	}
}

//인터페이스는 기본적으로 퍼블릭
//인터페이스는 기본적으로 abstract, 요즘 들어 default 사용한 것
