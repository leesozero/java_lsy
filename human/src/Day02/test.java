package Day02;

public class test {

		public static void main(String[] args) {
					
			int a = 10;
			int b = 20;
			
			int c;
			int d;
			
		
			c = ++a + b;
			d = a++ + b;
			// 1. a + b
			// 2. c = 30
			// 3. a = a + 1
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("c = " + c);
			System.out.println("d = " + d);
			
			// c = ++a + b;
			// 1. a = a + 1
			// 2. a + b
			// 3. c = 31
			
		}
}
