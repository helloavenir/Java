package stringEx;

public class Ex36 {

	public static void main(String[] args) {
		String ss = "�Ʊ� ���, �ѷ�� �Ʊ� ���, �ѷ�� �ѷ�ѷ� �ѷ�� �Ʊ� ��� ���� ���, \r\n"
				+ "�ѷ�� ���� ���, �ѷ�� �ѷ�ѷ� �ѷ�� ���� ��� �ƺ� ���, �ѷ�� �ƺ�\r\n"
				+ "���, �ѷ�� �ѷ�ѷ� �ѷ�� �ƺ� ��� �ҸӴ� ���, �ѷ�� �ҸӴ� ���, \r\n"
				+ "�ѷ�� �ѷ�ѷ� �ѷ�� �ҸӴ� ��� �Ҿƹ��� ���, �ѷ�� �Ҿƹ��� ���, \r\n"
				+ "�ѷ�� �ѷ�ѷ� �ѷ�� �Ҿƹ��� ��� ������ �ѷ�� ������ �ѷ�� �ѷ��\r\n"
				+ "�� �ѷ�� ������ ������, �ѷ�� ������, �ѷ�� �ѷ�ѷ� �ѷ�� ������ ��\r\n"
				+ "����, �ѷ�� �� ����, �ѷ�� �ѷ�ѷ� �ѷ�� �� ����! ��Ҵ�, �ѷ�� ���\r\n"
				+ "��, �ѷ�� �ѷ�ѷ� �ѷ�� ��Ҵ� ��� �ȳ�, �ѷ�� ��� �ȳ�, �ѷ�� ��\r\n"
				+ "��ѷ� �ѷ�� ��� �ȳ�!";		
		System.out.println("1. �ѱ��̴� " + ss.length());
		
		int count = 0;
		for(int i = 0; i < ss.length(); i++) {
			if(ss.charAt(i) == '��')
				count++;
		}
		System.out.println("2. '��' ���ڴ� " + count + "�� �ֽ��ϴ�.");
		
		String[] arr = ss.split(",");
		System.out.println("3. �޸��� �и��� ���ڿ��� ������ " + arr.length + "�Դϴ�.");
		
		
		System.out.println("4. �и��� ���ڿ��� ���������ϰ� ��� : ");
		for (int i=0; i < arr.length ; i++) {
			System.out.println(arr[i].trim());
		}
	
		String rp = ss.replace("���", "��");
		System.out.println("5. ���� ������ ��� : " + rp);
		
		String[] arr2 = ss.split(" ");
		int count2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].contains("���"))
				count2++;
		}
		
		System.out.println("6. ������ �� " + count2 + "�� �̷������ϴ�.");		
		
	}

}
