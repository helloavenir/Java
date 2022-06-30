package stringEx;

public class Ex36 {

	public static void main(String[] args) {
		String ss = "아기 상어, 뚜루루 아기 상어, 뚜루루 뚜루뚜루 뚜루루 아기 상어 엄마 상어, \r\n"
				+ "뚜루루 엄마 상어, 뚜루루 뚜루뚜루 뚜루루 엄마 상어 아빠 상어, 뚜루루 아빠\r\n"
				+ "상어, 뚜루루 뚜루뚜루 뚜루루 아빠 상어 할머니 상어, 뚜루루 할머니 상어, \r\n"
				+ "뚜루루 뚜루뚜루 뚜루루 할머니 상어 할아버지 상어, 뚜루루 할아버지 상어, \r\n"
				+ "뚜루루 뚜루뚜루 뚜루루 할아버지 상어 꼬르륵 뚜루루 꼬르륵 뚜루루 뚜루뚜\r\n"
				+ "루 뚜루루 꼬르륵 도망쳐, 뚜루루 도망쳐, 뚜루루 뚜루뚜루 뚜루루 도망쳐 더\r\n"
				+ "빨리, 뚜루루 더 빨리, 뚜루루 뚜루뚜루 뚜루루 더 빨리! 살았다, 뚜루루 살았\r\n"
				+ "다, 뚜루루 뚜루뚜루 뚜루루 살았다 상어 안녕, 뚜루루 상어 안녕, 뚜루루 뚜\r\n"
				+ "루뚜루 뚜루루 상어 안녕!";		
		System.out.println("1. 총길이는 " + ss.length());
		
		int count = 0;
		for(int i = 0; i < ss.length(); i++) {
			if(ss.charAt(i) == '루')
				count++;
		}
		System.out.println("2. '루' 글자는 " + count + "개 있습니다.");
		
		String[] arr = ss.split(",");
		System.out.println("3. 콤마로 분리된 문자열의 개수는 " + arr.length + "입니다.");
		
		
		System.out.println("4. 분리된 문자열을 공백제거하고 출력 : ");
		for (int i=0; i < arr.length ; i++) {
			System.out.println(arr[i].trim());
		}
	
		String rp = ss.replace("상어", "고래");
		System.out.println("5. 고래로 변경해 출력 : " + rp);
		
		String[] arr2 = ss.split(" ");
		int count2 = 0;
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i].contains("상어"))
				count2++;
		}
		
		System.out.println("6. 변경은 총 " + count2 + "번 이뤄졌습니다.");		
		
	}

}
