/**
 * Comment.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.entity;

import java.sql.Date;

/**
 * 评论实体类
 */
public class Comment extends ArticleId {

	private int comment_id;// 评论id
	private int user_id;// 评论用户id
	private String user_name;// 评论用户名字
	private Date add_date;// 评论时间
	private String com_content;// 评论内容
	private boolean ischecked;// 审核通过

	/**
	 * @return the comment_id
	 */
	public int getComment_id() {
		return comment_id;
	}

	/**
	 * @param comment_id the comment_id to set
	 */
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}

	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	/**
	 * @return the add_date
	 */
	public Date getAdd_date() {
		return add_date;
	}

	/**
	 * @param add_date the add_date to set
	 */
	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}

	/**
	 * @return the com_content
	 */
	public String getCom_content() {
		return com_content;
	}

	/**
	 * @param com_content the com_content to set
	 */
	public void setCom_content(String com_content) {
		this.com_content = com_content;
	}

	/**
	 * @return the ischecked
	 */
	public boolean isIschecked() {
		return ischecked;
	}

	/**
	 * @param ischecked the ischecked to set
	 */
	public void setIschecked(boolean ischecked) {
		this.ischecked = ischecked;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comment [comment_id=" + comment_id + ", user_id=" + user_id + ", user_name="
				+ user_name + ", add_date=" + add_date + ", com_content=" + com_content
				+ ", ischecked=" + ischecked + ", article_id=" + article_id + "]";
	}

}
