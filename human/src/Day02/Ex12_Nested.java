package Day02;

import java.util.Scanner;

public class Ex12_Nested {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//위에  스캐너 코드 다 치는건지??
		
		//정보처리기사 자격증 합격기준
		// 4학년, 70점이상 취득
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();
		
		if( year == 4 ) {
			if( score >= 70 ) {
				System.out.println("합격~!");
			}else {
				System.out.println("불합격!~");
			}
		} else {
			System.out.println("응시 자격요건 해당 안됨");
		}
		
		sc.close();
	}

}
