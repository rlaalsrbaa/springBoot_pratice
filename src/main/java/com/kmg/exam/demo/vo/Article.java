package com.kmg.exam.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article{
	private int id;
	private String title;
	private String body;
	private int memberId;
	private String regDate;
	private String updateDate;
	
	
	private String extra__writerName;
	private boolean extra__actorCanDelete;

}