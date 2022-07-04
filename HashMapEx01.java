package hashMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		// key - 영단어  value - 영단어에 대한 한글 뜻
		// HashMap 객체 생성
		HashMap<String, String> map = new HashMap<> ();
		
		
		// 데이터 삽입 put(k,v)
		map.put("apple", "사과");
		map.put("ape", "유인원");
		map.put("abnormal", "비정상적인");
		map.put("age", "나이");
		map.put("ant", "개미");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		
		

	}

}
