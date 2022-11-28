package Day09.Ex04_OuterInner;

public class Outter {
	String name = "아우터 클래스";
	
	void method() {
		System.out.println("아우터클래스");
		
		class Inner {
			
			String name = "이너 클래스";
			
			void method() {
				System.out.println("이너 클래스");
				
			}
			
			void print() {
				System.out.println(this.name);
				this.method();
				
				System.out.println(Outter.this.name);
				Outter.this.method();
			}
		}
	}
}
