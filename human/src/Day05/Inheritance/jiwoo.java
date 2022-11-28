package Day05.Inheritance;

public class jiwoo {
	public static void main(String[] args) {
		// 한번에 import 하기 ctrl+shift+o
		//객체 생성
		//클래스 타입 객체명 = new 클래스명();
		Pikachu pickachu = new Pikachu();
		// (.) 접근 연산자 : 객체의 변수, 메소드 접근하는 연산자
		pickachu.energy = 100;
		pickachu.type = "thunder";
		
		System.out.println("####### 피카츄 #######");
		System.out.println("에너지 :" + pickachu.energy);
		System.out.println("타입 :" + pickachu.type);
		System.out.println("공격 a :" + pickachu.aAttack());
		System.out.println("공격 b :" + pickachu.bAttack());
		System.out.println();
		
		Pikachu pikachu20 = new Pikachu(150, "진화");
		System.out.println("####### 피카츄(Lv.20) #######");
		System.out.println("에너지 :" + pickachu.energy);
		System.out.println("타입 :" + pikachu20.type);
		System.out.println("공격 a :" + pikachu20.aAttack());
		System.out.println("공격 b :" + pikachu20.bAttack());
		System.out.println();
	

		// 라이큐 객체 를 기본생성 하고 출력해보세요.
		Raichu raichu = new Raichu();
		System.out.println("####### 라이츄(Lv.20) #######");
		System.out.println("에너지 :" + raichu.energy);
		System.out.println("타입 :" + raichu.type);
		System.out.println("공격 a :" + raichu.aAttack());
		System.out.println("공격 b :" + raichu.bAttack());
		System.out.println();
		
		Raichu raichu40 = new Raichu(400, "mega-thunder");
		System.out.println("####### 라이츄(Lv.40) #######");
		System.out.println("에너지 : " + raichu40.energy);
		System.out.println("타입 : " + raichu40.type);
		System.out.println("공격 a : " + raichu40.aAttack());
		System.out.println("공격 b : " + raichu40.bAttack());
		System.out.println();
		
	}

}
