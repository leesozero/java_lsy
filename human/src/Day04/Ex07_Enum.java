package Day04;

public enum Rainbow {Red, orange, yellow, green, blue, indigo, violet, }
public class Ex07_Enum {
	public static void main(String[] args) {
		//ENUM (열거체)
		//요소들을 명명한 값으로 집합 이룬 자료형
		//특징
		//1 ENUM 비교할 때는 값뿐만 아니라 타입도 비교한다
		//2 ENUM의 상수값이 재정의되도 다시 컴파일 할 필요 없다
		
		
		Rainbow[] arr = Rainbow.values();
		for (Rainbow color : arr) {
			System.out.print(color + " ");
			
		}
		System.out.println();
		
		
		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.println("G : " + G);
		
		int index = G.ordinal();
		System.out.println("GREEN 의 index : " + index);
	
	}
}
