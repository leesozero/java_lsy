package Day11;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit; 

public class DateTimeCompareEx {
	public static void main(String[] args) {
		
		//2022년 11월 10일 9시 0분 0초
		LocalDateTime startDateTime = LocalDateTime.of(2022,  11, 10, 9, 0, 0);
		System.out.println("시작일 : " + startDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(2023,  6, 29, 9, 0, 0);
		System.out.println("종료일 : " + endDateTime);
		
		//현재 날짜 및 시간
		LocalDateTime nowTime = LocalDateTime.now();
		
		if (nowTime.isBefore(endDateTime)) {
			System.out.println("훈련과정 진행중");
			
		}else if( nowTime.isEqual(endDateTime)) {
			System.out.println("종강함");
		
		}else if( nowTime.isEqual(endDateTime)) {
			System.out.println("훈련과정 종료");
			
		}
		if (nowTime.isBefore(startDateTime)) {
			System.out.println("훈련과정 개강 전");
		}
		else if(nowTime.isEqual(startDateTime)) {
			System.out.println("개강함");
			
			
		}else if (nowTime.isAfter(startDateTime)) {
			System.out.println("개강일 지남");
			
		}
		
		
		//until()
		// : localdatetime 객체의 날짜/ 시간부터 인자로 지정한 객체의 날짜/시간까지
		//남은 시간 반환하는 메소드
		
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		System.out.println("남은시간 : " + remainYear);
		System.out.println("남은개월수 : " + remainMonth);
		System.out.println("남은일수 : " + remainDay);
		System.out.println("남은시 : " + remainHour);
		System.out.println("남은 : " + remainMinute);
		System.out.println("남은개월수 : " + remainSecond);
		
		
		//beetween()
		//ChronoUnit.상수.between(시작일 종료일)
		// 시작일자와 종료일자 사이의 남은 시간 지정한 상수 단위에 맞게 반환하는 메소드
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);		
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);		
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);		
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);		
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);		
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);	
		System.out.println("남은년도 : " + remainYear);
		System.out.println("남은개월수 : " + remainMonth);
		System.out.println("남은일수 : " + remainDay);
		System.out.println("남은시 : " + remainHour);
		System.out.println("남은분 : " + remainMinute);
		System.out.println("남은초 : " + remainSecond);
		System.out.println();
		
		
		
	}
}
