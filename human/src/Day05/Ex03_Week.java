package Day05;

public class Ex03_Week {
	public static void main(String[] args) {
		
		//배열 선언 및 생성
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
			
		}
		
		//배열 초기화와 동시에 생성
		String week[] = new String[] {"월","화","수","목","금","토","일"};
		String week2[] = {"월","화","수","목","금","토","일"};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + " ");
			
		}
		System.out.println();
		
		//foreach 배열의 모든 요소 반복
		
		for (String day : week2) {
			System.out.print(day + " ");
		}
		System.out.println(); 		
		
		
	}
}
