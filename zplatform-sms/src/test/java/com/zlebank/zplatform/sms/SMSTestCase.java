/* 
 * SMSTestCase.java  
 * 
 * version TODO
 *
 * 2016年1月12日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.sms;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zlebank.zplatform.commons.utils.DateUtil;
import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;
import com.zlebank.zplatform.sms.service.ISMSService;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月12日 上午9:07:49
 * @since 
 */
public class SMSTestCase {
	private ApplicationContext context;
	private ISMSService smsService;
	public void init(){
        context = new ClassPathXmlApplicationContext("smsContextTest.xml");
        smsService = (ISMSService) context.getBean("smsService");
    }
    
	@Test
	public void sendMsg(){
		init();
		smsService.sendSMS(ModuleTypeEnum.CHANGELOGINPWD, "18600806796", DateUtil.getCurrentDateTime(), null);
	}
	
	public void verifyCode(){
		init();
		int result = smsService.verifyCode("18600806796", "20160112091747", "498194");
		System.out.println(result);
	}
}
