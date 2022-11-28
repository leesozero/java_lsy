package Day03;


import java.util.Scanner;

public class Ex11_Star1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			// i : 0
			// i : 1
			for (int j = 0; j <= i; j++) {
				// i : 0. j : 0
				// i : 1, j : 0,1
				// i : 2, j : 0,1,2
				System.out.print("*");
								
			}
			
			System.out.println();
		}
		
		// 자연수 n을 입력받아서 삼각형모양의 "*" 출력하시오
		// 입력 : 5
		// 출력 :
		// *
		// **
		// ***
		// ****
		// *****
		
	}
}
