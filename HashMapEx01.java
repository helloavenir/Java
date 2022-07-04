package hashMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// key - ���ܾ�  value - ���ܾ ���� �ѱ� ��
		// HashMap ��ü ����
		HashMap<String, String> map = new HashMap<> ();
		
		
		// ������ ���� put(k,v)
		map.put("apple", "���");
		map.put("ape", "���ο�");
		map.put("abnormal", "����������");
		map.put("age", "����");
		map.put("ant", "����");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		

	}

}
