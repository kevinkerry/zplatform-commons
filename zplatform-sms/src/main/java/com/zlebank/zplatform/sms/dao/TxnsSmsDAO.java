/* 
 * TxnsSmsDAO.java  
 * 
 * version TODO
 *
 * 2016年1月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.sms.dao;

import com.zlebank.zplatform.commons.dao.BaseDAO;
import com.zlebank.zplatform.sms.pojo.PojoTxnsSms;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月11日 下午2:57:25
 * @since 
 */
public interface TxnsSmsDAO extends BaseDAO<PojoTxnsSms>{

	/**
	 * 获取最新的短信验证码
	 * @param orderNo
	 * @param phoneNo
	 * @return
	 */
	public PojoTxnsSms getLastSMS(String orderNo,String phoneNo);
	
	/**
	 * 保存短信验证码交易信息
	 * @param sms
	 */
	public void saveSMS(PojoTxnsSms sms);
	
	/**
	 * 获取最新的短信验证码
	 * @param moduleType 模板类型
	 * @param phoneNo 手机号
	 * @return
	 */
	public PojoTxnsSms getLastSMS(ModuleTypeEnum moduleType,String phoneNo);
}
