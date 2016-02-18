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

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

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

}
