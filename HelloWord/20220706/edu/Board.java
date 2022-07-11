package edu;

import java.util.*;
//필드생성
public class Board {
	private String title;
	private String content;
	private String user;
	private Date date;
	private int view;
//기본생성자
	public Board() {
		super();
	}
//풀생정자	
	public Board(String title, String content, String user, Date date, int view) {
		super();
		
		this.title=title;
		this.content=content;
		this.user=user;
		this.date=date;
		this.view=view;
		
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	
	
	
	
	
	
	
}
