package Day03;

import java.util.Scanner;

public class Ex17_Max {
	public static void main(String[] args) {
		//첫째 줄에 입력할 개수 N을 입력 받고,
		//둘째 줄에는 N개의 정수를 공백을 두고 입력 받으시오
		//N개의 정수 중 최대값 구해서 출력하기
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		int arr[]=new int[N]; //N 개의 배열요소 생성
		System.out.println(" " + N);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i]) {
				 max = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println(" 최대값 : " + max );
		// 최대값을 구하여 max에 대입하고 출력하기
		
		
		sc.close();
	}
}
