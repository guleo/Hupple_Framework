package com.tcxy.hupple.persist.domain;


/**
 * �򵥵�PO���� ��ʾ�
 * @author Administrator
 *
 */

public class Activity 
{
	private String title;
	
	private String content;
	
	public Activity() {
		super();
	}

	public Activity(String title, String content) {
		super();
		this.title = title;
		this.content = content;
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
}
