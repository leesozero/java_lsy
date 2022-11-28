package Day09.Ex07_AnonymousClass;

public class Anonymous {

	



	Person child = new Person() {
		void play() {
			System.out.println("놀이 합니다");
			
		}
	

		@Override
		void work() {
			System.out.println("공부합니다.");
		}
	};
	void methodA() {
		Person child2 = new Person() {
			void study() {
				System.out.println("공부를 합니다");
			}

			@Override
			void work() {
				System.out.println("알바를 합니다");
				study();
			}
						
			
		 };	

		 child2.work();
		}
	
	void methodB(Person person) {
		person.work();
	}
	


}
	
