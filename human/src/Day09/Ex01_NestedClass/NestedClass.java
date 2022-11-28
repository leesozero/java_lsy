package Day09.Ex01_NestedClass;



class A {
	//변수
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	//메소드
	void methodA() {
		System.out.println("A 클래스 - methodA()");
		
	}
	
	// 중첩 클래스 이너클래스
	class B {
		void methodB() {
			//상위 클래스(아우터 클래스)에서 선언한 변수 사용
			//변수의 접근지정자와 관계없이 아우터 클래스의 변수 사용 가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			
			methodA();
		}
	}
}
	public class NestedClass {
		public static void main(String[] args) {
			//아우터 클래스 객체 생성
			//아우터 클래스 이너클래스 객체명 = 아우터객체 .new 이너클래스();
			A a = new A ();
			//멤버 사용
			A.B b = a.new B();
			b.methodB();
		}

}
