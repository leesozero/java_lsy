package Day06.Ex01_Student;

public class StudenEx {
	public static void main(String[] args) {
	
		Student student = new Student();
		
		student.name = "김휴먼";
		student.age = 20;
		student.stdNo = "20221117";
		student.major = "컴퓨터공학과";

		int[] scores = {10, 20, 30, 40, 50};
		int[] scores2 = {100, 100, 100, 90, 95};
				
		Student student2 = new Student ("이명정님", 20, "20221234", "경제학과");
				
				
		System.out.println("####학생1####");
	    System.out.println("학생1 - 이름 :" + student.name);
	    System.out.println("학생1 - 나이 :" + student.age);
	    System.out.println("학생1 - 학번 :" + student.stdNo);
	    System.out.println("학생1 - 전공 :" + student.major);
	    System.out.println("학생1 - 중간고사 점수 : " +student.getScore(100, 90));
	    System.out.println("학생1 - 기말고사 점수 : " +student.getScore(100, 80));
	    System.out.println("학생1 - 최종 점수 : " +student.getScore(scores));
	    student.study("JAVA");
	    
	    
	    
	    System.out.println("####학생2####");
	    System.out.println("학생2 - 이름 :" + student2.name);
	    System.out.println("학생2 - 나이 :" + student2.age);
	    System.out.println("학생2 - 학번 :" + student2.stdNo);
	    System.out.println("학생2 - 전공 :" + student2.major);
	    System.out.println("학생2 - 중간고사 점수 : " +student2.getScore(100, 90));
	    System.out.println("학생2 - 기말고사 점수 : " +student2.getScore(100, 80));
	    System.out.println("학생2 - 최종 점수 : " +student2.getScore(scores2));
	    student2.study("데이터베이스");
	    


	}
	
}