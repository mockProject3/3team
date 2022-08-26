package com.example.reservation.board;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper  //Mapper 인터페이스 선언
public interface BoardMapper {

    List<BoardDto> selectBoardList() throws Exception;
    void insertBoard(BoardDto board) throws Exception;
    void updateHitCount(int board_id) throws Exception;
    BoardDto selectBoardDetail(int board_id) throws Exception;
    void updateBoard(BoardDto board) throws Exception;
    void deleteBoard(int board_id) throws Exception;
}