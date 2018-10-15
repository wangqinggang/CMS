/**
 * Vote.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.entity;

/**
 * 投票实体类
 */
public class Vote {

	private int vote_id;// 投票id
	private String vote_name;// 投票名称
	private String vote_content;// 投票内容
	private int vote_num;// 投票数

	/**
	 * @return the vote_id
	 */
	public int getVote_id() {
		return vote_id;
	}

	/**
	 * @param vote_id the vote_id to set
	 */
	public void setVote_id(int vote_id) {
		this.vote_id = vote_id;
	}

	/**
	 * @return the vote_name
	 */
	public String getVote_name() {
		return vote_name;
	}

	/**
	 * @param vote_name the vote_name to set
	 */
	public void setVote_name(String vote_name) {
		this.vote_name = vote_name;
	}

	/**
	 * @return the vote_content
	 */
	public String getVote_content() {
		return vote_content;
	}

	/**
	 * @param vote_content the vote_content to set
	 */
	public void setVote_content(String vote_content) {
		this.vote_content = vote_content;
	}

	/**
	 * @return the vote_num
	 */
	public int getVote_num() {
		return vote_num;
	}

	/**
	 * @param vote_num the vote_num to set
	 */
	public void setVote_num(int vote_num) {
		this.vote_num = vote_num;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vote [vote_id=" + vote_id + ", vote_name=" + vote_name + ", vote_content="
				+ vote_content + ", vote_num=" + vote_num + "]";
	}

}
