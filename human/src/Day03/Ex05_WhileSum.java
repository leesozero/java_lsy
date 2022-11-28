package Day03;

public class Ex05_WhileSum {

	public static void main(String[] args) {
		
		// 1부터 50까지 합계 구하기
		// 1+2+3+4+...+50 = 5050
		int sum = 0;
		int a = 1;
		
		
		while(a <= 100 ) {
			// 복합대입연산자
			
			sum += a++;
			// sum = sum + a;
			//a++;			
			
		}
		
		System.out.println("합계 : " + sum);
	}
}
