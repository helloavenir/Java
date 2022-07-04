package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberManager {
	// ����ڰ� ������ ��� Ÿ���� �迭�� ��
	ArrayList <Member> members;
	
	// �Ű����� �ִ� �����ڸ� ������� �ϸ�, �⺻ �����ڴ� �ڵ� �������� �����Ƿ� ���� �ۼ�
	public MemberManager() {
//		����� �۵��� ���� �����͸� ����
//		ArrayList �����ڷ� �� ���� �ٷ����� �𸣴� �ڷḦ �ٷ�
		members = new ArrayList<Member>();
	}
	
	public boolean insert(String name, String tel, String email) {
		if (members.add(new Member(name, tel, email))) return true;
		else return false;
		
	}
	
	public String search(String name) {
		// indexOf()�� �ڵ����� equals()�� �ڵ� ȣ������
		int index = members.indexOf(new Member(name, "", ""));
		if(index != 1) return members.get(index).getTel();
		else return null;

	}

//	�ƹ� �͵� ���� ���� ����� üũ�� -1�̶�� ������ �˷��ַ��� void�� int�� ����Ÿ�� �ٲ�
	public int printAll() {
		int size = members.size();
		if (size <= 0) return -1;
		
		// iterator ��ü �̿��Ϸ��� Ÿ�� �������� ��
		Iterator<Member> it = members.iterator();
		System.out.println(" �̸�    ��ȭ��ȣ       �̸���");
		
		while(it.hasNext()) {
			Member member = it.next();
			System.out.println(member.getName() + "    " + member.getTel() + "   " + member.getEmail());
		}
		return size;
		
		// Member member = it.next();
		// System.out.println(member);
		// ��ü ��¿� �־� toString() �� ���������� ������, 
        // ��ü�� ���� �ؽ��ڵ�, �ּҰ� ��µȴ�.
		// Member Ŭ�������� toString() �������̵�
		
		
		
	}
}


