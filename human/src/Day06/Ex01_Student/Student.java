package Day06.Ex01_Student;

public class Student {

		
		//학생의 속성 : 이름, 나이, 학번, 전공
		//변수
		
		String name;
		int age;
		String stdNo;
		String major;
		
		
		public Student() {
			
		}
		
		
		
		
		public Student(String name, int age, String stdNo, String major) {
			this.name = name;
			this.age = age;
			this.stdNo = stdNo;
			this.major = major;
		}




		//학생의 행동
		//메소드
		public void study(String subject) {
			System.out.println(subject + "(을/를) 공부합니다.");
			
			// 반환타입이 void면 return 을 작성하지 않는다.
		}
		
		//국영수 순으로
		//점수의 평균을 반환하는 메소드
		public double getScore(int score1, int score2) {
			double average = 0.0;
			//(평균) = (합계) / (개수)
			average = (double) (score1 + score2) / 2;
			return average;
			
		}
		
		
		// 메소드 오버로딩			
		public double getScore(int score1, int score2, int score3) {
			 double average = 0.0;
			 int sum = 0;
			 average = (double)(score1 + score2 + score3) /3;
				 return average;
			
		}
		
					
		// 메소드 오버로딩			
		public double getScore(int[] scores) {
			 double average = 0.0;
			 int sum = 0;
			 for (int score : scores) {
				 sum += score;
				
			}
			average = sum + scores.length;
			return average;
			
		}
}
