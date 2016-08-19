/* 
 * CityDAOImpl.java  
 * 
 * version TODO
 *
 * 2015年9月13日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.commons.dao.CityDAO;
import com.zlebank.zplatform.commons.dao.pojo.PojoCity;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午5:58:53
 * @since 
 */
@Repository
public class CityDAOImpl extends HibernateBaseDAOImpl<PojoCity> implements CityDAO {


    @Override
    public PojoCity getCityByCode(String code) {
       return (PojoCity)this.getSession().createCriteria(PojoCity.class)
       .add(Restrictions.eq("", code)).uniqueResult();
        
    }

	/**
	 *
	 * @param pid
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<PojoCity> getCityByPID(Long pid) {
		Criteria criteria = this.getSession().createCriteria(PojoCity.class);
		criteria.add(Restrictions.eq("pId", pid));
		return criteria.list();
	}

}
