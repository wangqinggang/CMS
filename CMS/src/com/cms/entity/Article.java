/**
 * Article.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.entity;

import java.sql.Date;

/**
 * 文章实体类
 */
public class Article extends ArticleId {

	private String title;// 标题
	private int user_id;// 用户id
	private String summary;// 简介
	private String content;// 正文
	private int readtimes;// 阅读数
	private int hits;// 评论数
	private Date add_date;// 发布日期
	private int channel_id;// 所属栏目

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary the summary to set
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the readtimes
	 */
	public int getReadtimes() {
		return readtimes;
	}

	/**
	 * @param readtimes the readtimes to set
	 */
	public void setReadtimes(int readtimes) {
		this.readtimes = readtimes;
	}

	/**
	 * @return the hits
	 */
	public int getHits() {
		return hits;
	}

	/**
	 * @param hits the hits to set
	 */
	public void setHits(int hits) {
		this.hits = hits;
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
	 * @return the channel_id
	 */
	public int getChannel_id() {
		return channel_id;
	}

	/**
	 * @param channel_id the channel_id to set
	 */
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [title=" + title + ", user_id=" + user_id + ", summary=" + summary
				+ ", content=" + content + ", readtimes=" + readtimes + ", hits=" + hits
				+ ", add_date=" + add_date + ", channel_id=" + channel_id + ", article_id="
				+ article_id + "]";
	}

}
