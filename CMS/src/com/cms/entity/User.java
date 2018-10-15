/**
 * User.java Version 1.0.0 Created on 2017年7月2日 Copyright Wangqingang
 *
 */
package com.cms.entity;

/**
 * 用户实体类
 */
import java.sql.Date;


public class User extends UserId {

	private String user_name;// 用户名
	private String user_pwd;// 用户密码
	private Date reg_date;// 注册日期
	private Date last_login_date;// 上次登录
	private boolean iscomment;// 允许评论
	private boolean isvote;// 允许投票

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_pwd=" + user_pwd + ", reg_date=" + reg_date
				+ ", last_login_date=" + last_login_date + ", iscomment=" + iscomment + ", isvote="
				+ isvote + ", user_id=" + user_id + "]";
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
	 * @return the user_pwd
	 */
	public String getUser_pwd() {
		return user_pwd;
	}

	/**
	 * @param user_pwd the user_pwd to set
	 */
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	/**
	 * @return the reg_date
	 */
	public Date getReg_date() {
		return reg_date;
	}

	/**
	 * @param reg_date the reg_date to set
	 */
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	/**
	 * @return the last_login_date
	 */
	public Date getLast_login_date() {
		return last_login_date;
	}

	/**
	 * @param last_login_date the last_login_date to set
	 */
	public void setLast_login_date(Date last_login_date) {
		this.last_login_date = last_login_date;
	}

	/**
	 * @return the iscomment
	 */
	public boolean isIscomment() {
		return iscomment;
	}

	/**
	 * @param iscomment the iscomment to set
	 */
	public void setIscomment(boolean iscomment) {
		this.iscomment = iscomment;
	}

	/**
	 * @return the isvote
	 */
	public boolean isIsvote() {
		return isvote;
	}

	/**
	 * @param isvote the isvote to set
	 */
	public void setIsvote(boolean isvote) {
		this.isvote = isvote;
	}



}
