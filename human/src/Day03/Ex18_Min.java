package Day03;

import java.util.Scanner;

public class Ex18_Min {
	public static void main(String[] args) {
		
		// 최소값 구하기
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();		
		int arr[]=new int[N]; //N 개의 배열요소 생성
		
				
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if ( min > arr[i]) {
				 min = arr[i];
			}
			System.out.print(arr[i] + " ");
		}
		System.out.println(" 최소값 : " + min );
	 
		
		sc.close();
	}
}
