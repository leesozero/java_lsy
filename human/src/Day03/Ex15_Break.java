package Day03;

import java.util.Scanner;

public class Ex15_Break {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("stop 입력하면 종료");
		
		while(true) {
			System.out.print("입력 : ");
			String str = sc.nextLine();
			
			if( str.equals("STOP"))
				break;
			System.out.println(">>"+ str);
			
		}
		
		System.out.println("프로그램 종료..");
		sc.close();
	}
}
1