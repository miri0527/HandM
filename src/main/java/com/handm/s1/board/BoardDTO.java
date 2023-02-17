package com.handm.s1.board;

import java.sql.Date;

public class BoardDTO {
	private Long boardNum;
	private String boardTitle;
	private String boardContents;
	private String boardWriter;
	private Date boardDate;
	private Long boardTotal;
	
	public Long getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(Long boardNum) {
		this.boardNum = boardNum;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContents() {
		return boardContents;
	}
	public void setBoardContents(String boardContents) {
		this.boardContents = boardContents;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardDate() {
		return boardDate;
	}
	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}
	public Long getBoardTotal() {
		return boardTotal;
	}
	public void setBoardTotal(Long boardTotal) {
		this.boardTotal = boardTotal;
	}
	
	
	

}
