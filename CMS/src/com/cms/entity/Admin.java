/**
 * Admin.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.entity;

/**
 * 管理员实体类
 */
public class Admin {

	private int admin_id;// 管理员id
	private String admin_name;// 管理员名称
	private String admin_pwd;// 管理员密码
	private boolean admin_right;// 管理员权限开启,默认1 开启

	/**
	 * @return the admin_id
	 */
	public int getAdmin_id() {
		return admin_id;
	}

	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	/**
	 * @return the admin_name
	 */
	public String getAdmin_name() {
		return admin_name;
	}

	/**
	 * @param admin_name the admin_name to set
	 */
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}

	/**
	 * @return the admin_pwd
	 */
	public String getAdmin_pwd() {
		return admin_pwd;
	}

	/**
	 * @param admin_pwd the admin_pwd to set
	 */
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}

	/**
	 * @return the admin_right
	 */
	public boolean getAdmin_right() {
		return admin_right;
	}

	/**
	 * @param admin_right the admin_right to set
	 */
	public void setAdmin_right(boolean admin_right) {
		this.admin_right = admin_right;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_pwd="
				+ admin_pwd + ", admin_right=" + admin_right + "]";
	}

}
