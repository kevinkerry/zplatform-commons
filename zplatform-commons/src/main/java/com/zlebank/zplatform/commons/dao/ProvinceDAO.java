
/* 
 * ProvinceDAO.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao;

import com.zlebank.zplatform.commons.dao.pojo.PojoProvince;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午5:53:21
 * @since 
 */
public interface ProvinceDAO extends BaseDAO<PojoProvince> {
   /**
    * 通过省代码得到省
    * @param code
    * @return PojoProvince
    */
    public PojoProvince getProvinceByCode(String code);
    /**
     * 通过省代码得到省
     * @param code
     * @return PojoProvince
     */
    public PojoProvince getProvinceByXZCode(String code);
}
