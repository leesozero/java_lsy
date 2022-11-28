package Day05;

import java.util.Scanner;

/*
 금액 : 534760
 50000 : 10매
 10000 : 3개
 5000 : 0개
 1000 : 4개
 500 : 1개
 100 : 2개
 50 : 1개
 10 : 1개
 5 : 0개
 1 : 0개
 
 위와 같이 금액 입력하면 큰 화폐단위부터 계산하여
 화폐단위별로 화폐매수를 출력하는 프로그램을 작성하시오.  
  
 */

// 순서도 작성하는 습관

// 필요한 변수 선언
// 입력금액, 화폐매수, 화폐단위
// 입력금액 입력
// 2 화폐매수 계산
// [조건] 큰 화폐 단위부터 계산한다.
// 화폐매수 계산
// (화폐매수) = (입력금액) / (화폐단위)
// count = 534760 / 50000= 10

// 잔액계산
// 잔액 = (입력금액) - (화폐단위x화폐매수)
// input = input - (money*count)
// (잔액) = (입력금액) % (화폐단위)
// input = input % money

// 화폐단위 변환
// 50000 > 10000      :50000 / 5
// 10000 > 5000       :10000 / 2
// 5000 > 1000        :5000 / 5
// 1000 > 500         :1000 / 2

// 3-1 ~ 3-3 의 과정을 (화패단위)가 1보다 크거나 같으먄 반복
// 3-1

 

public class Ex02_NumberOfCurrency {
	
	public static void main(String[] args) {
		
		int input;     //입력금액
		int count;     //화폐매수
		int money = 50000 ; //큰화폐단위부터
		boolean sw = true; // 화폐단위 변환 스위치 변수
		
		System.out.print("금액 :");
		Scanner sc = new Scanner(System.in);		
		input = sc.nextInt();
	
		while(money >= 1) {
			
			count = input / money;
			System.out.println(money + "\t : " + count + "개");
			
			input = input % money;
			
			if( sw ) {
				money = money / 5;
				sw = false;
				
			} else {
				money = money / 2;
				sw = true;
			}
		}
	}
}


