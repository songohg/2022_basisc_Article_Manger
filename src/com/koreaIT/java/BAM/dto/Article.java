package com.koreaIT.java.BAM.dto;

public class Article {	
		int id;
		String regDate;
		String title;
		String body;
		int viewCnt;
		
		Article(int id, String regDate, String title, String body){
			this(id, regDate, title, body, 0);	
		}

		Article(int id, String regDate, String title, String  body, int viewCnt) {
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

