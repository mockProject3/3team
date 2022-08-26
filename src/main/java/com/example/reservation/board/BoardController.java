package com.example.reservation.board;

import com.example.reservation.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/board/boardList")
    public ModelAndView openBoardList(@SessionAttribute(name = "user", required = false) User user) throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardList");   //view를 설정해준다.
        List<BoardDto> list = boardService.selectBoardList();     //service를 이용하여 게시판 목록을 데이터베이스에서 조회한다.
        mv.addObject("list",list);                                //설정한 뷰로 넘겨줄 데이터를 추가
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping("/board/openBoardDetail")
    public ModelAndView openBoardDetail(@RequestParam int board_id) throws Exception{
        ModelAndView mv = new ModelAndView("/board/boardDetail");
        BoardDto board = boardService.selectBoardDetail(board_id);
        mv.addObject("board",board);
        return mv;
    }

    @RequestMapping("/board/updateBoard")  // 수정요청
    public String updateBoard(BoardDto board) throws Exception {
        boardService.updateBoard(board);         //게시글 수정
        return "redirect:/board/openBoardList";  //수정완료 후 게시판 목록으로
    }

    @RequestMapping("/board/deleteBoard")  //삭제요청
   // @GetMapping("/delete/{boardIdx}")
   public String deleteBoard(BoardDto board) throws Exception {
   // public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception {
        boardService.deleteBoard(board.getBoardId());      //게시글 삭제
       // boardService.deleteBoard(boardIdx);      //게시글 삭제
        return "redirect:/board/boardList";  //삭제완료 후 게시판 목록으로
    }

    @RequestMapping("/board/boardWrite")
    public String boardWrite(BoardDto board) throws Exception{

        return "/board/boardWrite";
    }

    @RequestMapping("/board/insertBoard")
    public String insertBoard(BoardDto board) throws Exception {
        boardService.insertBoard(board);
        return "redirect:/board/boardList";
    }

}