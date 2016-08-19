/* 
 * CountyDAO.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao;

import java.util.List;

import com.zlebank.zplatform.commons.dao.pojo.PojoCounty;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午5:52:13
 * @since 
 */

public interface CountyDAO extends BaseDAO<PojoCounty> {
        /**
         * 通过区代码得到区
         * @param code
         * @return PojoCounty
         */
    public PojoCounty getCountByCode(String code);
    
    /**
     * 通过cid取得区集合
     * @param cid
     * @return
     */
    public List<PojoCounty> getCountyByCID(Long cid);
}
