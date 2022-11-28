package Day04;

import java.util.Scanner;

public class Ex04_WhileArray {
	public static void main(String[] args) {
		//정수 5개 입력받아 배열에 저장
		// y입력 하면 한번 더 입력
		// 입력 하면 종료하는 프로그램 작성하시오
		
		Scanner sc= new Scanner(System.in);
		
		int arr [] = new int[5];
		String finish = "";
		
		do {
			System.out.println("정수 5개 입력");
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
				
			}
			
			sc.nextLine();
			
			System.out.print("다시 입력?(Y/N) : ");
			finish = sc.nextLine();
			System.out.println(finish);
			
			
		} While (finish.equals("Y"));
		
		sc.close();
	}
}
