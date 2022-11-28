package Day01;

import java.util.Scanner;

public class Ex02_Intro{
	
	public static void main(String[] args) {
		System.out.println("이름, 주소, 자기소개를 공백을 두고 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.println("이름 : " + name);
		
		String address = sc.next();
		System.out.println("이름 : " + address);
		
		String profile = sc.next();
		System.out.println("이름 : " + profile);

		
		sc.close();
		

		
	}
}