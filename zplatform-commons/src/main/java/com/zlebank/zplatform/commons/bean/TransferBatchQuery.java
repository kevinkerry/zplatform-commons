/* 
 * TransferBatchQuery.java  
 * 
 * version TODO
 *
 * 2015年12月10日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;

import com.zlebank.zplatform.commons.bean.Bean;

/**
 * 划拨查询
 *
 * @author yangpeng
 * @version
 * @date 2015年12月10日 上午11:08:04
 * @since 
 */
public class TransferBatchQuery implements Bean {
    /**批次号**/
    private String batchno;
    /**状态**/
    private String status;
    /**划拨类型**/
    private String transfertype;
   /**财务处理状态**/
    private String accstatus;

    public String getBatchno() {
        return batchno;
    }
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getTransfertype() {
        return transfertype;
    }
    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype;
    }
    public String getAccstatus() {
        return accstatus;
    }
    public void setAccstatus(String accstatus) {
        this.accstatus = accstatus;
    }
        
        
        
        
        

}
