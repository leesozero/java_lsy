package Day04;

import java.util.Scanner;

// 정수n을 입력받아서 다음과 같이 작성 하시오
// 지그재그 로 출력하시오
// n이 5라면 다음과 같이 출력한다.
 // 1 2 3 4 5
//10 9 8 7 6
//11 12 13 14 15
//20 19 18 17 16
//21 22 23 24 25

public class Ex06_ZigZig {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];

		int k = 1; //증가하는수
		int sw = 1; // 방향 전환 수
		
		for (int i = 0; i < n; i++) {
			
		if (sw == 1) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = k++;
			}
		}
		
				if(sw == -1) {
					for (int j = n-1; j >= 0; j--) {
						arr[i][j] = k++;
						
					}
					 
				}
				sw *= -1;
			}
				
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}

