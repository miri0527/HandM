package com.handm.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/*" )
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="list" , method = RequestMethod.GET)
	public ModelAndView getBoardList() throws Exception {
		ModelAndView mv = new ModelAndView();
		
		List<BoardDTO> ar =  boardService.getBoardList();
		mv.setViewName("notice/list");
		mv.addObject("list", ar);
		return mv;
	}
	
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public ModelAndView getBoardDetail(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		boardDTO = boardService.getBoardDetail(boardDTO);
		mv.setViewName("notice/detail");
		mv.addObject("dto", boardDTO);
		return mv;
	}
	
	@RequestMapping(value = "update" , method = RequestMethod.GET)
	public ModelAndView setBoardUpdate(BoardDTO boardDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		
		boardDTO = boardService.getBoardDetail(boardDTO);
		mv.setViewName("notice/update");
		mv.addObject("dto", boardDTO);
		return mv;
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView setBoardUpdate(BoardDTO boardDTO, ModelAndView mv) throws Exception {
		int result = boardService.setBoardUpdate(boardDTO);
		System.out.println("Service : " + result);
		mv.setViewName("redirect:./list");
		mv.addObject("dto", boardDTO);
		return mv;
	}
	
	
}
