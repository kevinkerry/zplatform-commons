/* 
 * RecordedPojo.java  
 * 
 * version 1.0
 *
 * 2015年8月21日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Pojo with create user id , create date,update user ,update date
 *
 * @author yangying
 * @version
 * @date 2015年8月21日 上午10:38:00
 * @since
 */
public abstract class RecordedPojo extends Pojo implements Serializable{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 8226134998843018710L;
	private long inUser;
	private Timestamp inTime;
	private long upTime;
	private Timestamp upDate;

	public long getInUser() {
		return inUser;
	}

	public void setInUser(long inUser) {
		this.inUser = inUser;
	}

	public Timestamp getInTime() {
		return inTime;
	}

	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}

	public long getUpTime() {
		return upTime;
	}

	public void setUpTime(long upTime) {
		this.upTime = upTime;
	}

	public Timestamp getUpDate() {
		return upDate;
	}

	public void setUpDate(Timestamp upDate) {
		this.upDate = upDate;
	}

}
