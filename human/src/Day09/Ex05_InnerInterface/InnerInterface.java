package Day09.Ex05_InnerInterface;


class A {
	interface B {
		public abstract void method();
		  
	}
}
class C implements A.B {

	@Override
	public void method() {
		System.out.println("이너인터페이스 구현 클래스");
	}
	
}
public class InnerInterface {
	public static void main(String[]args) {
		A.B ab = new C();
		C c = new C();
		c.method();
		
		 
		A.B b = new A.B() {

			@Override
			public void method() {
				System.out.println("익명 이너 클래스로 객체 생성");
			}
			 
			
		};
		
		b.method();
	}

}
