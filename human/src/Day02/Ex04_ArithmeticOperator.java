package Day02;

public class Ex04_ArithmeticOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c;
		// 증감연산자
		// ++a, a++ : a를 1 증가
		// --a, a-- : a를 1 감소
		
		c = a++ + b;
		System.out.println("c = " + c);
		System.out.println("a = " + a);
		
		int x = 10;
		int y = 20;
		int z;
		
		z = ++x + y;
		
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("x = " + x);
		
	
	}

}
