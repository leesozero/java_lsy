package Day02;

public class Ex08_TernaryOperator {

	public static void main(String[] args) {

		int a = 3, b = 5;
		
		int result = ( a > b ) ? a-b : b-a;
		System.out.println(" 두 수의 차 : " + result);
	}

}
