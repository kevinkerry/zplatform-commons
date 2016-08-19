/* 
 * PojoSeqNo.java  
 * 
 * version 1.0
 *
 * 2015年9月18日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Class Description
 *
 * @author yangying
 * @version
 * @date 2015年9月18日 下午4:37:42
 * @since
 */
public class PojoSeqNo implements Serializable{
    /**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1563408955588588375L;
	private long id;
    private int seqNo;
    private Date today;
    private int length;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getSeqNo() {
        return seqNo;
    }
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }
    public Date getDate() {
        return today;
    }
    public void setDate(Date currentDate) {
        this.today = currentDate;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
