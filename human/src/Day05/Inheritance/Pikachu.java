package Day05.Inheritance;

public class Pikachu {
	
	// 클래스 : 객체를 정의하는 설계도
	// 멤버 : 변수, 메소드
	
	// 변수
	public int energy;
	public String type;
	
	//생성자
	public Pikachu() {
		this(100, "thunder");
//		energy = 100;
//		type = "thunder";
	}
	// 생성자 자동완성 하는 방법 
	// Alt + Shift + S > 소스메뉴 나온다 알파벳o누르면 바로나온다
	// 매개변수가 있는 생성자
	// 메소드(생성자) 오버로딩
	
	
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	
	
	// 메소드
	// 접근지정자 반환타입 메소드명(매개변수) {};
	
	public String aAttack() {
		//return
		//메소드를 종료
		//메모리 공간 해제
		//값 메소드를 호출한 자리로 반환
		return "십만볼트";
	}
	
	public String bAttack() {
		return "전광석화";
	}

}
