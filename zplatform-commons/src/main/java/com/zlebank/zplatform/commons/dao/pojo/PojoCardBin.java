/* 
 * CardBin.java  
 * 
 * version TODO
 *
 * 2015年10月10日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年10月10日 下午4:06:33
 * @since 
 */
@Entity
@Table(name="T_CARD_BIN")
public class PojoCardBin implements Serializable {
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private String cardBin;
    
    private String cardLen;
    
    private String binLen;
    
    private String cardName;
    
    private String bankCode;
    
    private String Type;
    @Id
    @Column(name = "CARDBIN")
    public String getCardBin() {
        return cardBin;
    }
    @Id
    @Column(name = "CARDLEN")
    public String getCardLen() {
        return cardLen;
    }
 
    @Column(name = "BINLEN")
    public String getBinLen() {
        return binLen;
    }
    public void setBinLen(String binLen) {
        this.binLen = binLen;
    }
    @Column(name = "CARDNAME")
    public String getCardName() {
        return cardName;
    }

    @Column(name = "BANKCODE")
    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }
    @Column(name = "TYPE")
    public String getType() {
        return Type;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin;
    }

    public void setCardLen(String cardLen) {
        this.cardLen = cardLen;
    }

  

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setType(String type) {
        Type = type;
    }
    
    
    
    

}
