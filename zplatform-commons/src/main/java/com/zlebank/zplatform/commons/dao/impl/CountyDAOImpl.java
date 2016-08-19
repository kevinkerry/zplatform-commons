/* 
 * CountyDAOImpl.java  
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

import com.zlebank.zplatform.commons.dao.CountyDAO;
import com.zlebank.zplatform.commons.dao.pojo.PojoCounty;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月13日 下午6:02:34
 * @since 
 */
@Repository
public class CountyDAOImpl  extends HibernateBaseDAOImpl<PojoCounty>implements CountyDAO {


    @Override
    @Transactional(readOnly=true)
    public PojoCounty getCountByCode(String code) {
        Criteria crite= getSession().createCriteria(PojoCounty.class);
        crite.add(Restrictions.eq("xzCode", code));
        PojoCounty pojo = (PojoCounty) crite.uniqueResult();
        return pojo;
//        return (PojoCounty)this.getSession().createCriteria(PojoCounty.class)
//                .add(Restrictions.eq("xzCode", code)).uniqueResult();
    }

	/**
	 *
	 * @param cid
	 * @return
	 */
	@Override
	@Transactional(readOnly=true)
	public List<PojoCounty> getCountyByCID(Long cid) {
		Criteria crite= getSession().createCriteria(PojoCounty.class);
        crite.add(Restrictions.eq("Cid", cid));
		return crite.list();
	}

}
