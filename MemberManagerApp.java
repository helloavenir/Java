package practice;

import java.util.Scanner;

public class MemberManagerApp {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
//		MemberManager���� ����� ��ü�� ����
		MemberManager memberManager = new MemberManager();
		
		while (true) {
		System.out.println("*** ȸ�� ���� ���� ���α׷� ***");
		System.out.println("�޴� [1] �߰� [2] ���� [3] ���� [4] ���� >> ");	
		int menu = scn.nextInt();
		if (menu == 4) {
			System.out.println("���α׷��� �����մϴ�.");
			break;
		}
		if (menu == 1) {
		System.out.println("��ȭ��ȣ �߰��� �����߽��ϴ�.");
	    // insert(); name, tel, email
		System.out.println("�̸� >> ");
		String name = scn.next();
		System.out.println("��ȭ��ȣ >> ");
		String tel = scn.next();
		System.out.println("�̸��� >> ");
		String email = scn.next();
		
		if (memberManager.insert(name, tel, email)) {
			System.out.println(name + " " + tel + " " + email);
		}
		else System.out.println("��� ����");
		}
		else if (menu == 2) {
			System.out.println("��ȭ��ȣ �˻��� �����߽��ϴ�.");
			System.out.println("�̸��� �Է��ϼ��� >> ");
			String name = scn.next();
            String tel = memberManager.search(name);
            if (tel != null) {
            	System.out.println(name + " ���� ��ȭ��ȣ�� " + tel + " �Դϴ�.");            
            }
            else System.out.println("�˻��� ������ �����ϴ�.");
		}	
		else if (menu == 3) {
			System.out.println("��ȭ��ȣ ����� �����߽��ϴ�.");
			int size = memberManager.printAll();
			// ����� ������ ���� �� �ǵ�� ���� �߰�
			if (size == -1) {
				System.out.println("����� ������ �����ϴ�.");
			}

		}
		}
	}

}
