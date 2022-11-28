package Day06.Ex04_Board;

import java.sql.Date;

/**
 * 게시판
 * 
 * 
 * 
 * 
 */
public class Board {

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	// date 날짜/사간 다루는 클래스
	// ctrl + shift + o : 자동 import

	private Date regDate;
	private Date updDate;

	// shift + alt + s 생성자 만들기

	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	// getter, setter

}
