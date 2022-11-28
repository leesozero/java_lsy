package Day02;

public class Ex06_BitOperator {

	public static void main(String[] args) {
		// AND
		// 20 (십진수) -> 0001 0100 (이진수)
		// 16 (십진수0 -> 0001 0000 (이진수)
		// 이진수 : 0 또는 1로만 표현 한 수
		
		// 0001 0100
		// 0001 0000
		// ----------
		// 0001 0000 -> 16
		int result = 20 & 16;
		System.out.println(20 & 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------");
		System.out.println( Integer.toBinaryString(result));
		
		int result2 = 20 | 16;
		System.out.println(20 | 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------");
		System.out.println( Integer.toBinaryString(result2));
		
		int result3 = 20 ^ 16;
		System.out.println(20 ^ 16);
		System.out.println(Integer.toBinaryString(20));
		System.out.println(Integer.toBinaryString(16));
		System.out.println("-----------");
		System.out.println( Integer.toBinaryString(result3));
		
		int result4 = ~20;
		System.out.println(~20);
		System.out.println(Integer.toBinaryString(20));
		System.out.println("-----------");
		System.out.println( Integer.toBinaryString(result4));
	
		// 시프트 연산 산술/논리
		// 산술 : 부호비트 유지하면서 왼쪽 오른쪽으로 이동 << >>
		// 논리 : 부호비트 포함해서 전체 왼쪽 오른쪽으로 이동 <<< >>>
		
		System.out.println(2 << 1);
		System.out.println(2 << 2);
		System.out.println(2 << 3);
		System.out.println();

		System.out.println(16 >> 1);
		System.out.println(16 >> 2);
		System.out.println(16 >> 3);
		System.out.println();

		
	}

}
