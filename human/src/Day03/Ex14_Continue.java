package Day03;

import java.util.Scanner;

public class Ex14_Continue {
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if(n < 0) countinue;
			
			sum += n;
		}
		
		System.out.println("양수의 합 :" + sum);
		sc.close();
	}
}
