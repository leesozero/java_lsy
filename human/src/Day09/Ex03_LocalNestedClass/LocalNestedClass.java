package Day09.Ex03_LocalNestedClass;


class A {
	int a= 100;
	
	void methodA() {
		int b = 200;
		
		class B {
			void methodB() {
				System.out.println(a);
				System.out.println(b);
				a = 300;
				//b = 400;
				
			}
		}
		B bobj = new  B();
		bobj.methodB();
	}
}
public class LocalNestedClass {
	public static void main(String[] args) {
		A a = new A();
		a.methodA();
	}

}
