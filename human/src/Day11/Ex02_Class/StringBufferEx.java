package Day11.Ex02_Class;

public class StringBufferEx {
	public static void main(String[] args) {
		//StringBuffer
		//문자열 조작하는클래스
		//문자열 추가 수정 삭제 가능
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb);
		
		
		//append("추가할 문자열") 문자 맨뒤에 문자추가
		sb.append(" is Java");
		System.out.println(sb);
		
		// insert (index, "추가문자열") : 지정한 index위치에 문자열 추가
		sb.insert(7, " real");
		System.out.println(sb);
		
		//insert(시작index, 끝index+1, "대체 문자열")
		//: 시작 index~ 끝index 까지 문자열을 새문자열로 대체
		sb.replace(8, 12, "good");
		System.out.println(sb);
		
		//delete(시작index, 끝index+1)
		//: 시작 index~ 끝index 까지 문자열삭제
		sb.delete(8, 13);
		System.out.println(sb);
		
		//setLength 길이 : 문자열길이지정
		sb.setLength(4);
		System.out.println(sb);
		
		
	}
}
