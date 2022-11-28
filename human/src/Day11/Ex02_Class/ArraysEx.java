package Day11.Ex02_Class;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysEx {
	public static void main(String[] args) {
		
		//정렬되지 않은 배열요소들
		int[] arr = {5, 3, 4, 1, 2};
		
		//배열을 정렬(sort)
		//5 3 4 1 2 > 1 2 3 4 5
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
						
		}
		System.out.println();
		
		//100개의 랜덤수를 배열요소로 갖는 배열
		int[] random = new int[100];
		
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 100 + 1);
			
		}
		
		Arrays.sort(random);
		
		for (int i = 0; i < random.length; i++) {
			System.out.print(random[i] + " ");
			
		}
		System.out.println();
		
		
		//이진 검색 알고리즘 사용하여 검색 후
		// 해당 값 있으면 그위치(index)반환
		//찾지 못했으면 ( -9(insertion point) -1 ) 음수 반환
		
		if(Arrays.binarySearch(random, 10) < 0 ) {
			System.out.println("랜덤 수 10이 없음");
		}
		else {
			System.out.println("index : " + Arrays.binarySearch(random, 10) );
			
		}
		
		
		int fill[] = new int[10];
		
		Arrays.fill(fill, 6);
		
		for (int i = 0; i < fill.length; i++) {
			System.out.print(fill[i]);
			
		}
		System.out.println();
		
		int copy[] = Arrays.copyOf(fill,  3);
		
		
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");		
		
		}
		System.out.println();
		
		
		int copyRange[] = Arrays.copyOfRange(copy, 2, 4);
		
		for (int i = 0; i < copyRange.length; i++) {
			System.out.println( copyRange[i] + " ");
		}
	System.out.println();
	}
}
