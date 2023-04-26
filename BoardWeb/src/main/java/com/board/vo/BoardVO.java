package com.board.vo;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardVO {
	private int board_number;
	private String board_title;
	private String board_author;
	private String board_date;
	private String board_count;
	private String board_contents;
}
