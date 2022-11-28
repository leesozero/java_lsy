package Day11.Ex02_Class;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {


		//StringTokenizer
		//구분문자를 기준으로 문자열을 분리하는 클래스
		//구분문자 : , 탭 / . 등등
		//토큰(token) : 구분 문자로 분리된 문자열
		
		String java = "클래스/생성자/상속/오버로딩/오버라이딩/추상클래스/인터페이스";
		StringTokenizer st = new StringTokenizer(java, "/");
		
		// countTokens() - 분리한 토큰 개수
		System.out.println("토큰의 수 :" + st.countTokens());
		
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			
		}
		
	}
}
