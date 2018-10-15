/**
 * Channel.java Version 1.0.0 Created on 2017年7月5日 Copyright Wangqingang
 *
 */
package com.cms.entity;

/**
 * 栏目实体类
 */
public class Channel extends ChannelId {

	private String channel_name;// 栏目名称
	private String channel_type;// 栏目类型
	private int sort;// 排序
	private boolean isparent;// 是否是父栏目
	private boolean isshow;// 是否显示
	private int parent;// 父栏目id

	/**
	 * @return the channel_name
	 */
	public String getChannel_name() {
		return channel_name;
	}

	/**
	 * @param channel_name the channel_name to set
	 */
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}

	/**
	 * @return the channel_type
	 */
	public String getChannel_type() {
		return channel_type;
	}

	/**
	 * @param channel_type the channel_type to set
	 */
	public void setChannel_type(String channel_type) {
		this.channel_type = channel_type;
	}

	/**
	 * @return the sort
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * @param sort the sort to set
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

	/**
	 * @return the isparent
	 */
	public boolean isIsparent() {
		return isparent;
	}

	/**
	 * @param isparent the isparent to set
	 */
	public void setIsparent(boolean isparent) {
		this.isparent = isparent;
	}

	/**
	 * @return the isshow
	 */
	public boolean isIsshow() {
		return isshow;
	}

	/**
	 * @param isshow the isshow to set
	 */
	public void setIsshow(boolean isshow) {
		this.isshow = isshow;
	}

	/**
	 * @return the parent
	 */
	public int getParent() {
		return parent;
	}

	/**
	 * @param parent the parent to set
	 */
	public void setParent(int parent) {
		this.parent = parent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Channel [channel_name=" + channel_name + ", channel_type=" + channel_type
				+ ", sort=" + sort + ", isparent=" + isparent + ", isshow=" + isshow + ", parent="
				+ parent + ", channel_id=" + channel_id + "]";
	}



}
