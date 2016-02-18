/* 
 * SmsModuleDAOImpl.java  
 * 
 * version TODO
 *
 * 2016年1月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.sms.dao.impl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.sms.dao.SmsModuleDAO;
import com.zlebank.zplatform.sms.pojo.PojoSmsModule;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月11日 下午4:51:13
 * @since 
 */
@Repository("smsModuleDAO")
public class SmsModuleDAOImpl extends HibernateBaseDAOImpl<PojoSmsModule> implements SmsModuleDAO{

	/**
	 *
	 * @param moduleType
	 * @return
	 */
	@Override
	@Transactional(readOnly = true)
	public PojoSmsModule getModuleByType(ModuleTypeEnum moduleType) {
		String hql = "from PojoSmsModule where moduletype = ?";
		Query query = getSession().createQuery(hql);
		query.setString(0, moduleType.getCode());
		return (PojoSmsModule) query.uniqueResult();
	}

	
}
