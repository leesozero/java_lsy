package Day04;

import java.util.Scanner;

public class Ex04_Lotto {

	public static void main(String[] args) {
		
		// 입력받기..		
		// 당첨번호 7개 입력
		// 당첨번호 6개 입력
		// 당번6개와 선택번호6개 비교
		// 같은번호 > 개수+1
		//다른번호
		//개수확인
		//개수 6 > 1등
		//개수5 > 3등
		//개수4 > 4등
		//개수3 5등
		//개수2이하> 0
		//등수 출력
		
		Scanner sc = new Scanner(System.in);
		int lotto [] = new int[7];
		int lotto2 [] = new int[6];
		int count = 0;
		int rank = 0;
		
			
		
		//입력
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = sc.nextInt();
			
		}
		for (int j = 0; j < lotto2.length; j++) {
			lotto2[j] = sc.nextInt();
			
		}
		
	
		
		
		//비교
		for (int i = 0; i < lotto2.length; i++) {
			for (int j = 0; j < lotto2.length; j++) {
				if( lotto2[i] == lotto[j] ) {
					count++;
					break;
				}
			}			
			
		}
		
	
		// 개수확인
		switch (count) {
		case 6:
			rank = 1;
			break;
			
		case 5:
			rank = 3;
			for (int i = 0; i < lotto2.length; i++) {
				if( lotto[6] == lotto2[i]) {
					rank = 2;
				}
				
			}
			1
			// 여기에 보너스일치 하면 2등 출력
			// 보너스 일치 코드 해야함
			break;
			
		case 4:
			rank = 4;
			break;
			
		
		case 3:
			rank = 5;
			break;
	
			
		default:
			break;
		}
		
		System.out.println("rank");		
		sc.close();
		
		
 	}
}
