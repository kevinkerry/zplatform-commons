/* 
 * SmsModuleDAO.java  
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
import com.zlebank.zplatform.sms.pojo.PojoSmsModule;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月11日 下午2:53:55
 * @since 
 */
public interface SmsModuleDAO extends BaseDAO<PojoSmsModule>{

	/**
	 * 获取短信模板信息
	 * @param moduleType
	 * @return
	 */
	public PojoSmsModule getModuleByType(ModuleTypeEnum moduleType);
}
