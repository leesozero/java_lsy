package Day06.Ex02_Calculator;


//슬래시 별2개

/**
 * 계산기
 * 피연산자를 2개로 하는 계산기
 * 기능
 *  덧셈 : 정수2개를 덧셈
 *  뺄셈 : 정수 인자1 - 인자2 연산하는 뺄셈
 *  곱셈 : 실수 2개를 곱셈
 *  나눗셈 : 실수 인자1 / 인자2 연산하는 나눗셈
 *  나머지 : 정수 인자1 % 인자2 연산하는 나머지 연산
 *  합계 : 배열 매게변수로 전달받아 모든요소 합을 구함
 *  평균 : 배열을 매개변수로 전달받아, 평균 구함
 */


public class Calculator {
	//덧셈
	public int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	//뺼셈
	public int minus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	//곱셈
	public double multiple(double a, double b) {
		double result= a * b;
		return result;
	}
	
	//나눗셈
	public double divide(double a, double b) {
		double result = a / b;
		return result;
		
		
	}
	
	//합계
	public int sum(int[] arr) {
		
		int sum = 0;
		for (int i : arr) {
			sum +=i;
			
		}
		return sum;
	}
	
	
	//평균
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = (double) sum / arr.length;
		return avg;
	}
	
}

















