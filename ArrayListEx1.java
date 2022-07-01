package arrayListEx;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		//���ϸ�� ���� arraylist �̿�
		ArrayList <String> fr = new ArrayList<String>();
		System.out.println(fr.size());
		//���� �߰� add(obj)
		fr.add("apple");
		fr.add("banana");
		fr.add("cherry");
		fr.add("mango");
		System.out.println(fr.size());
		
		//���� ��� �߰� add(index, obj)
		//arraylist ��� ��� get(index)
		fr.add(1, "grape");
		for(int i = 0; i <fr.size(); i++) {
			System.out.println(fr.get(i));
		}
		System.out.println("==============");
		//for each�� (�⺻��: ���)
		for(String f : fr) {
			System.out.println(f);
		}
		System.out.println("==============");
		
		System.out.println(fr);
		
		//�˻��ϱ� contains(obj)
		if(fr.contains("apple")) {
			int index = fr.indexOf("apple");
			System.out.println("���� ��� �߿� " + (index+1) + "��° �ֽ��ϴ�.");
		}
		else {
			System.out.println("���� ��� �߿� �����ϴ�.");			
		}
		
		//�˻� equals() �̿� 
		int i;
		for(i = 0; i < fr.size(); i++) {
			if (fr.get(i).equals("cherry")) {
				System.out.println("���� ��� �߿� " + (i+1) + "��° �ֽ��ϴ�.");
				break;
				}
			}
		if( i == fr.size()) {
			System.out.println("���ϸ�� �߿� cherry�� �����ϴ�.");
		}
		
		if(fr.remove("grape")) {
			System.out.println("grape�� �����߽��ϴ�.");
		}
		else {
			System.out.println("grape�׸��� �����ϴ�.");	
		}
		System.out.println(fr);
		
		String f = fr.remove(0);
		System.out.println(f + "�����߽��ϴ�.");
		System.out.println(fr);
		
		//��� �׸� ���� clear()
		fr.clear();
		System.out.println(fr.size());
		
	}

}
