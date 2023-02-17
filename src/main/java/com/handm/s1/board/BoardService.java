package com.handm.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> getBoardList()throws Exception {
		List<BoardDTO> ar =  boardDAO.getBoardList();
		return ar;
	}
	
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception {
		BoardDTO boardDTO2 =  boardDAO.getBoardDetail(boardDTO);
		return boardDTO2;
	}
	
	public int setBoardUpdate(BoardDTO boardDTO) throws Exception {
		int result =  boardDAO.setBoardUpdate(boardDTO);
		return result;
	}
}
