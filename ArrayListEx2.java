package arrayListEx;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList <Student> sts = new ArrayList <>();
		
		//�л����� ����
//		Student st = new Student("ȫ���", "010-1234-5678", "����� ������");
//		sts.add(st);
		sts.add(new Student("ȫ���", "010-1234-5678", "����� ������"));
		sts.add(new Student("����", "010-2347-5678", "����� ���۱�"));
		sts.add(new Student("������", "010-9080-3678", "����� ���ʱ�"));
		sts.add(new Student("�ع���", "010-3454-5978", "��⵵ �ϻ�"));
		
		System.out.println(sts.size());
		
		//�л����� ���
		for(int i = 0; i < sts.size(); i++) {
			System.out.println(sts.get(i));   // print()��  ��ü���� �����ϸ� �ڵ����� toString()
		}
		
		//for-each�� ���
		for(Student st : sts) {
			System.out.println(st);
			
		}
		
		//�л����� �˻�
//		sts.contains(obj);
		Student temp = new Student("����","","");
		if(sts.contains(temp)) {
			int index = sts.indexOf(temp);
			System.out.println("���� ��ȭ��ȣ: " + sts.get(index).getPhone());
		}
		
		//equals() �̿��� �л����� �˻� 
		int i;
		for(i = 0; i < sts.size(); i++) {
			// Student st = sts.get(i);
			//Student temp = new Student("����","","");
			//st.equals(temp);
			//equals �������̵忡��
			//��ü�� �޾ƿ���� �����Ƿ� 
			// ���� �� ������ new Student(�̸�, ������, ������)���·� ����� �Ѱ���
			if(sts.get(i).equals(new Student("����","",""))) {
				String tel = sts.get(i).getPhone();
			    System.out.println("���� ��ȭ��ȣ: " + tel);
			    break;
		    }
		        
	     }
		if(i == sts.size()) System.out.println("ã�� ������ �����ϴ�.");
		
		
		// �л����� ����
		if(sts.remove(temp)) {
			System.out.println("���� ���� ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("ã�� ������ �����ϴ�.");
		}
			
		//��� ��ü ����
		sts.clear();
		System.out.println(sts.size() + "���� ������ ���ҽ��ϴ�.");	
		
	}

}
