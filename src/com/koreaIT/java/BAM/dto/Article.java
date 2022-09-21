package com.koreaIT.java.BAM.dto;

public class Article extends Dto {	
		public String title;
		public String body;
		public int viewCnt;
		
	public Article(int id, String regDate, String title, String body){
			this(id, regDate, title, body, 0);	
		}

	public Article(int id, String regDate, String title, String  body, int viewCnt) {
			this.id = id;
			this.title = title;
			this.body = body;
			this.regDate = regDate;
			this.viewCnt = viewCnt;
		}

		public void addViewCnt() {
			viewCnt++;
		}
	}

