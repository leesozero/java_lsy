package Day03;

import java.util.Scanner;

public class Ex02_Grade {
	public static void main(String[] args) {
		
		System.out.print("학점 : ");
		Scanner sc = new Scanner(System.in);
		
			
		// sc.next();       >> String
		// toUpperCase()    >> 대문자로 변환
		// charAt(0)        >> 문자열 에서 문자를 해당 index의 추출
        // char grade = sc.next().charAt(0);
		
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
		
		case 'A':
			System.out.println("90~100점 입니다.");
			break;
		
		case 'B':
			System.out.println("80~89점 입니다.");
			break;
			
		case 'C':
			System.out.println("70~79점 입니다.");
			break;

		case 'D':
			System.out.println("60~69점 입니다.");
			break;
		
		case 'F':
			System.out.println("60점 미만 입니다.");
			break;
			
		default:
			System.out.println("A_F 사이의 문자를 입력해 주세요.");
			break;
			
		}
		sc.close();
	}
	
}
