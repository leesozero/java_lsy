package Day11.Ex01_Wrapper;

public class ValueCompare {

		public static void main(String[] args) {
			Integer intObj1 = 10;
			Integer intObj2 = 10;
			
			System.out.println("intObj1 == intObj2");
			System.out.println("결과 : " + (intObj1 == intObj2));
			System.out.println("언방식 하여 비교");
			System.out.println("결과 : " + (intObj1.intValue() == intObj2.intValue() ));

			System.out.println("equals() 로 비교");
			System.out.println("결과 : " + intObj1.equals(intObj2) );
			
			System.out.println("-----------------------------------");
			
			Integer intObj3 = 200;
			Integer intObj4 = 200;
			
			//==, != 기호로 래퍼객체 비교하면, 아래 범위에서는 내부값을 바로 비교가능
			// Boolean타입 : true, false
			// 정수 타입 : -128 ~ 127 범위에서
			// char : \u0000 ~ \007f
			System.out.println("intObj3 == intObj4");
			System.out.println("결과 : " + (intObj3 == intObj4));
			System.out.println("언방식 하여 비교");
			System.out.println("결과 : " + (intObj3.intValue() == intObj4.intValue() ));

			System.out.println("equals() 로 비교");
			System.out.println("결과 : " + intObj3.equals(intObj4) );
		}
}
			