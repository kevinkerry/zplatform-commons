/* 
 * PojoCity.java  
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
 * @date 2015年9月13日 下午4:41:27
 * @since 
 */
@Entity
@Table(name="T_CITY")
public class PojoCity {
   
    private long cityId;
    
    private String cityName;
    
    private String cityZcode;
    
    private String cityPcode;
    
    private long pId;
    
    private String cityCode;
    
    private String xzCode;
    @Id
    public long getCityId() {
        return cityId;
    }
    @Column(name="C_NAME")
    public String getCityName() {
        return cityName;
    }
    @Column(name="C_ZCODE")
    public String getCityZcode() {
        return cityZcode;
    }
    @Column(name="C_PCODE")
    public String getCityPcode() {
        return cityPcode;
    }
    @Column(name="P_ID")
    public long getpId() {
        return pId;
    }
    @Column(name="C_CODE")
    public String getCityCode() {
        return cityCode;
    }
    @Column(name="XZ_CODE")
    public String getXzCode() {
        return xzCode;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityZcode(String cityZcode) {
        this.cityZcode = cityZcode;
    }

    public void setCityPcode(String cityPcode) {
        this.cityPcode = cityPcode;
    }

    public void setpId(long pId) {
        this.pId = pId;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setXzCode(String xzCode) {
        this.xzCode = xzCode;
    }
    
    
    
    

}
