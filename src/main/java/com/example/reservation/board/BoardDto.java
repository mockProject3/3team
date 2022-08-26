package com.example.reservation.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private int boardId;
    private String title;
    private String contents;
    private int hitCnt;
    private String createdAt;
    private String creatorId;
    private String updatedAt;
    private String updaterId;
}