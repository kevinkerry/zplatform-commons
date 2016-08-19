/* 
 * CityDAO.java  
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

import com.zlebank.zplatform.commons.dao.pojo.PojoCity;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午5:50:58
 * @since 
 */
public interface CityDAO extends BaseDAO<PojoCity> {
    /**
     * 通过市代码得到市
     * @param code
     * @return PojoCity
     */
	@Deprecated
    public PojoCity getCityByCode(String code);
	
	/**
	 * 通过省份ID取得市信息集合
	 * @param pid
	 * @return
	 */
	public List<PojoCity> getCityByPID(Long pid);
    
}
