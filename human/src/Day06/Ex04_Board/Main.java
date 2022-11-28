package Day06.Ex04_Board;

import java.util.Scanner;

public class Main {
	
	int max = 10; //게시글 최대 10개 제한
	static Board[] boardList = new Board[max];
	static int index = 0; //현재 게시글 순서번호(0 ~ max-1)
	
	public static void showMenu() {
		System.out.println("#######게시판#######");
		System.out.println("1 게시글 목록");
		System.out.println("2 게시글 읽기");
		System.out.println("3 게시글 쓰기");
		System.out.println("4 게시글 수정");
		System.out.println("5 게시글 삭제");
		System.out.print("#######번호 입력 :");
		
	}
	
	//게시글 목록
	public static void list() {
		System.out.println("#게시글 목록");
		for (Board board : boardList) {
			System.out.println(board);
			
		}
		
	}
	//게시글 쓰기
	public static void write(Board board) {
		if (index < max) {
			boardList[index] = board;
			index++;
			board.setBoardNo(index);
		}else {
			System.out.println("게시글 목록 꽉 찼습니다.");
			
		}
	}
	
	
	//게시글 읽기
	public static void read(int boardNo) {
		Board board = boardList[boardNo-1];
		System.out.println(board);
	}
	
	//게시글 수정
	public static void update(int boardNo, Board board) {
		
		
	}
		
		
		
		
		
			// 01234
			// 12345
	if (boardNo >= 1 && boardNo <= max) {
		boardList[boardNo-1] = board;
	}else {
		System.out.println("게시글이 존재하지 않습니다.");
		
	}
		
		Scanner sc = new Scanner(System.in);
		int  menuNo = 0;
		int count = 0; //게시글 개수
		
		// 메뉴판 반복하여 출력
		
		do {
			showMenu();
			//입력
			menuNo = sc.nextlnt();
			
			
			//메뉴선택
			switch (menuNo) {
			
			//게시글 목록
			case 1 : list();
					break;
	
			//게시글 읽기
			case 2 : System.out.print("게시글 번호 : ");
					boardNo = sc.nextInt();
					read(boardNo);
					break;
			
					
			//게시글 쓰기
			case 3 :
					System.out.print();"제목 : ");
			        String title = sc.nextLine();
			        System.out.print("내용 : ");
			        content = sc.nextLine();
			        System.out.print("작성자 : ");
			        writer = sc.nextLine();
			        board = new Board (title, content, writer);
			        write(board);
			        break;
			        
								
			//게시글 수정			
			case 4 : 
					System.out.print("게시글 번호 : ");
					boardNo = sc.nextInt();
					System.out.print("제목 : ");
					title = sc.nextLine();
					System.out.print("내용 : ");
					content = sc.nextLine();
					System.out.print("작성자 : ");
					writer = sc.nextLine();
					board = new Board(title, content, writer);
					update(boardNo,board);
					break;
			
			//게시글 삭제
			case 5 : System.out.print("게시글 번호 : ");
					 boardNo = sc.nextInt();
					 delete(boardNo);
					 break;
			
			default:
					break;
					
			}
			
			
			
		} while (count <= max);
		
	}
}
