/* 
 * TxnsSmsDAOImpl.java  
 * 
 * version TODO
 *
 * 2016年1月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.sms.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zlebank.zplatform.commons.dao.impl.HibernateBaseDAOImpl;
import com.zlebank.zplatform.commons.utils.DateUtil;
import com.zlebank.zplatform.sms.dao.TxnsSmsDAO;
import com.zlebank.zplatform.sms.pojo.PojoTxnsSms;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月11日 下午4:52:22
 * @since 
 */
@Repository("txnsSmsDAO")
public class TxnsSmsDAOImpl extends HibernateBaseDAOImpl<PojoTxnsSms> implements TxnsSmsDAO{
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public PojoTxnsSms getLastSMS(String orderNo,String phoneNo) {
        String hql = " from PojoTxnsSms where tn = ? and overduetime > ? and mobile = ? order by tid desc";
        Query query = getSession().createQuery(hql);
        query.setString(0, orderNo);
        query.setString(1, DateUtil.getCurrentDateTime());
        query.setString(2, phoneNo);
        List<PojoTxnsSms> smsList =  (List<PojoTxnsSms>) query.list();
        if(smsList.size()>0){
            return smsList.get(0);
        }
        return null;
    }
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public PojoTxnsSms getLastSMS(ModuleTypeEnum moduleType,String phoneNo) {
        String hql = " from PojoTxnsSms where moduletype = ? and overduetime > ? and mobile = ? order by tid desc";
        Query query = getSession().createQuery(hql);
        query.setString(0, moduleType.getCode());
        query.setString(1, DateUtil.getCurrentDateTime());
        query.setString(2, phoneNo);
        
		List<PojoTxnsSms> smsList =  (List<PojoTxnsSms>) query.list();
        if(smsList.size()>0){
            return smsList.get(0);
        }
        return null;
    }

	/**
	 *
	 * @param sms
	 */
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW,rollbackFor=Throwable.class)
	public void saveSMS(PojoTxnsSms sms) {
		 getSession().save(sms);
	}
}
