/* 
 * TransferBatch.java  
 * 
 * version TODO
 *
 * 2015年12月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.bean;


/**
 * 划拨bean
 *
 * @author yangpeng
 * @version
 * @date 2015年12月8日 下午4:12:44
 * @since 
 */
public class TransferData implements Bean{
    private long tid;
    private String batchno;
    private String tranid;
    private String acctype;
    private String accno;
    private String accname;
    private String banktype;
    private String bankname;
    private Long transamt;
    private String remark;
    private String resv;
    private String status;
    private String banktranid;
    private String resptype;
    private String respcode;
    private String respmsg;
    private String trandate;
    private String trantime;
    private String relatedorderno;
    private String busicode;
    private String busitype;
    private String splitflag;
    private String accstatus;
    private String accinfo;
    private String transfertype;
    /**创建时间**/
    private String createtime;
    
    private String money;
    
    /**手续费**/
    private String fee;
    
    /**交易序列号**/
    private String txnseqNo;
    /** 初审人 **/
    private Long stexauser;
    /** 初审时间 **/
    private String stexatime;
    /** 初审意见 **/
    private String stexaopt;
    /** 复审人 **/
    private Long cvlexauser;
    /** 复审时间 **/
    private String cvlexatime;
    /** 复审意见 **/
    private String cvlexaopt;
    
    
    
    
    
    public String getTxnseqNo() {
        return txnseqNo;
    }
    public void setTxnseqNo(String txnseqNo) {
        this.txnseqNo = txnseqNo;
    }
    public Long getStexauser() {
        return stexauser;
    }
    public void setStexauser(Long stexauser) {
        this.stexauser = stexauser;
    }
    public String getStexatime() {
        return stexatime;
    }
    public void setStexatime(String stexatime) {
        this.stexatime = stexatime;
    }
    public String getStexaopt() {
        return stexaopt;
    }
    public void setStexaopt(String stexaopt) {
        this.stexaopt = stexaopt;
    }
    public Long getCvlexauser() {
        return cvlexauser;
    }
    public void setCvlexauser(Long cvlexauser) {
        this.cvlexauser = cvlexauser;
    }
    public String getCvlexatime() {
        return cvlexatime;
    }
    public void setCvlexatime(String cvlexatime) {
        this.cvlexatime = cvlexatime;
    }
    public String getCvlexaopt() {
        return cvlexaopt;
    }
    public void setCvlexaopt(String cvlexaopt) {
        this.cvlexaopt = cvlexaopt;
    }
    public String getFee() {
        return fee;
    }
    public void setFee(String fee) {
        this.fee = fee;
    }
    public String getBusitype() {
        return busitype;
    }
    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }
    public String getMoney() {
        return money;
    }
    public void setMoney(String money) {
        this.money = money;
    }
    public long getTid() {
        return tid;
    }
    public void setTid(long tid) {
        this.tid = tid;
    }
    public String getBatchno() {
        return batchno;
    }
    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }
    public String getTranid() {
        return tranid;
    }
    public void setTranid(String tranid) {
        this.tranid = tranid;
    }
    public String getAcctype() {
        return acctype;
    }
    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
    public String getAccno() {
        return accno;
    }
    public void setAccno(String accno) {
        this.accno = accno;
    }
    public String getAccname() {
        return accname;
    }
    public void setAccname(String accname) {
        this.accname = accname;
    }
    public String getBanktype() {
        return banktype;
    }
    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }
    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public Long getTransamt() {
        return transamt;
    }
    public void setTransamt(Long transamt) {
        this.transamt = transamt;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getResv() {
        return resv;
    }
    public void setResv(String resv) {
        this.resv = resv;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBanktranid() {
        return banktranid;
    }
    public void setBanktranid(String banktranid) {
        this.banktranid = banktranid;
    }
    public String getResptype() {
        return resptype;
    }
    public void setResptype(String resptype) {
        this.resptype = resptype;
    }
    public String getRespcode() {
        return respcode;
    }
    public void setRespcode(String respcode) {
        this.respcode = respcode;
    }
    public String getRespmsg() {
        return respmsg;
    }
    public void setRespmsg(String respmsg) {
        this.respmsg = respmsg;
    }
    public String getTrandate() {
        return trandate;
    }
    public void setTrandate(String trandate) {
        this.trandate = trandate;
    }
    public String getTrantime() {
        return trantime;
    }
    public void setTrantime(String trantime) {
        this.trantime = trantime;
    }
    public String getRelatedorderno() {
        return relatedorderno;
    }
    public void setRelatedorderno(String relatedorderno) {
        this.relatedorderno = relatedorderno;
    }
    public String getBusicode() {
        return busicode;
    }
    public void setBusicode(String busicode) {
        this.busicode = busicode;
    }
    public String getSplitflag() {
        return splitflag;
    }
    public void setSplitflag(String splitflag) {
        this.splitflag = splitflag;
    }
    public String getAccstatus() {
        return accstatus;
    }
    public void setAccstatus(String accstatus) {
        this.accstatus = accstatus;
    }
    public String getAccinfo() {
        return accinfo;
    }
    public void setAccinfo(String accinfo) {
        this.accinfo = accinfo;
    }
    public String getTransfertype() {
        return transfertype;
    }
    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype;
    }
    public String getCreatetime() {
        return createtime;
    }
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
    
    
    

}
