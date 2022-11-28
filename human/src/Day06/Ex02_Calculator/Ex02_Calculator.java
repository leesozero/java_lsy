package Day06.Ex02_Calculator;

public class Ex02_Calculator {
	public static void main(String[] args) {
		
		//계산기 객체 생성
		
		Calculator calculator = new Calculator();
		int a = 10;
		int b = 5;
		int arr[] = {1,2,3,4,5};
		
		int plus = calculator.plus(a, b);
		int minus = calculator.minus(a, b);
		double multiple = calculator.multiple(a, b);
		double divide = calculator.divide(a, b);
		int sum = calculator.sum(arr);
		double avg = calculator.plus(a, b);
		
		System.out.println("plus : " + plus);
		System.out.println("minus : " + minus);
		System.out.println("multiple : " + multiple);
		System.out.println("divide : " + divide);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
