package Day03;

public class Ex06_OddEven {

	public static void main(String[] args) {

		// 1~20 까지의 정수 중,
		// 홀수의 합계, 짝수 의 합계 각각 구하여 출력 하시오.
		// while, if문 사용
		int sum = 0;
		int a = 1;
				
		while(a <= 20 ) {
			
			sum += a++;
			
		}
		
		if( a % 2 == 1 ) {
			sum1 += a;
		}
		
		if( a % 2 == 0 ) {
			sum2 += a;
			a++;
			
		}		
		System.out.println("홀수 합계 : " + sum1);
		System.out.println("짝수 합계 : " + sum2);
	}
		

}
