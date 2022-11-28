package Day09.Ex02_StaticNestedClass;

class A {
	int a = 5;
	static int b= 15;
	
	void methodA() {
		System.out.println("인스턴스 메소드");
	}
	
	static void methodB() {
		System.out.println("static 메소드");
	}
	
	static class B{
		void methodC() {
			//System.out.println(a); //static만 사용가능
			System.out.println(b);			
		
		//methodA();                 //static만 사용가능
		methodB();
		}
	}

}

public class StaticNestedClass {
	
	public static void main(String[] args) {
		A.B b = new A.B();
		
		b.methodC();
		
	}
	
}