/* 
 * PojoCounty.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午4:42:30
 * @since 
 */
@Entity
@Table(name="T_COUNTY")
public class PojoCounty {
    
    private Long countyId;
    
    private String countyName;
    
    private String countyZCode;
    
    private String countPCode;
    
    private Long  Cid;
    
    private String countCode;
    
    private String xzCode;
    
    private String cxzCode;
    
    private String pxzCode;
    

    @Column(name="T_ID")
    @Id
    public Long getCountyId() {
        return countyId;
    }

    @Column(name="T_NAME")
    public String getCountyName() {
        return countyName;
    }
    
    @Column(name="T_ZCODE")
    public String getCountyZCode() {
        return countyZCode;
    }
    @Column(name="T_PCODE")
    public String getCountPCode() {
        return countPCode;
    }
    @Column(name="C_ID")
    public Long getCid() {
        return Cid;
    }
    @Column(name="T_CODE")
    public String getCountCode() {
        return countCode;
    }
    @Column(name="XZ_CODE")
    public String getXzCode() {
        return xzCode;
    }
    @Column(name="CXZ_CODE")
    public String getCxzCode() {
        return cxzCode;
    }
    @Column(name="PXZ_CODE")
    public String getPxzCode() {
        return pxzCode;
    }

    public void setCountyId(Long countyId) {
        this.countyId = countyId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCountyZCode(String countyZCode) {
        this.countyZCode = countyZCode;
    }

    public void setCountPCode(String countPCode) {
        this.countPCode = countPCode;
    }

    public void setCid(Long cid) {
        Cid = cid;
    }

    public void setCountCode(String countCode) {
        this.countCode = countCode;
    }

    public void setXzCode(String xzCode) {
        this.xzCode = xzCode;
    }

    public void setCxzCode(String cxzCode) {
        this.cxzCode = cxzCode;
    }

    public void setPxzCode(String pxzCode) {
        this.pxzCode = pxzCode;
    }
    
    

}
