/* 
 * TransferBatchQuery.java  
 * 
 * version TODO
 *
 * 2015年12月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;

import java.util.Date;

/**
 * 划拨查询
 *
 * @author yangpeng
 * @version
 * @date 2015年12月8日 下午2:55:50
 * @since 
 */
public class TransferDataQuery implements Bean{
    /**业务类型**/
    private String busicode;
    /**批次号**/
    private String batchno;
    /**划拨流水号**/
    private String tranId;
    /**账户类型**/
    private String acctType;
    /**状态**/
    private String status;
    /**关联订单号**/
    private String relatedorderno;
    /**开始时间**/
    private Date startTime;
    /**结束时间**/
    private Date endTime;
    /**关联批次号**/
    private String batch;
    
    
    
    
    
    
    
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public String getBatchno() {
        return batchno;
    }
    public String getBusicode() {
        return busicode;
    }
    public void setBusicode(String busicode) {
        this.busicode = busicode;
    }
    public String getbatchno() {
        return batchno;
    }
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }
    public String getTranId() {
        return tranId;
    }
    public void setTranId(String tranId) {
        this.tranId = tranId;
    }
    public String getAcctType() {
        return acctType;
    }
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRelatedorderno() {
        return relatedorderno;
    }
    public void setRelatedorderno(String relatedorderno) {
        this.relatedorderno = relatedorderno;
    }
    
    
    
}
