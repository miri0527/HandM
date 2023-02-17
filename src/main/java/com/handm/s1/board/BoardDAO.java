package com.handm.s1.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.handm.s1.board.BoardDAO.";
	
	public List<BoardDTO> getBoardList() throws Exception{
		List<BoardDTO> ar =  sqlSession.selectList(NAMESPACE + "getBoardList");
		return ar;
	}
	
	public BoardDTO getBoardDetail(BoardDTO boardDTO) throws Exception{
		BoardDTO boardDTO2 = sqlSession.selectOne(NAMESPACE + "getBoardDetail", boardDTO);
		return boardDTO2;
	}
	
	public int setBoardUpdate(BoardDTO boardDTO)throws Exception {
		int result = sqlSession.update(NAMESPACE + "setBoardUpdate", boardDTO);
		return result;
	}
}
