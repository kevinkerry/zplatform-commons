/* 
 * ISMSService.java  
 * 
 * version TODO
 *
 * 2016年1月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.sms.service;

import com.zlebank.zplatform.sms.pojo.enums.ModuleTypeEnum;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年1月11日 下午4:28:59
 * @since 
 */
public interface ISMSService {

	/**
	 * 发送短信
	 * @param moduleType 短信模板类型
	 * @param phoneNo 手机号
	 * @param orderNo 订单号
	 * @param args 短信参数
	 * @return
	 */
	public int sendSMS(ModuleTypeEnum moduleType,String phoneNo,String orderNo,String... args);
	
	/**
	 * 校验短信验证码
	 * @param phoneNo 手机号
	 * @param orderNo 订单号
	 * @param code 验证码
	 * @return 1:验证成功 2：验证码错误，3验证码失效
	 */
	public int verifyCode(String phoneNo,String orderNo,String code);
	
	/**
	 * 校验短信验证码
	 * @param moduleType 短信模板类型
	 * @param phoneNo 手机号
	 * @param code 验证码
	 * @return
	 */
	public int verifyCode(ModuleTypeEnum moduleType,String phoneNo,String code);
	
	/**
	 * 生成短信验证码（不发送短信，短信由第三方发送）
	 * @param moduleType
	 * @param phoneNo
	 * @param orderNo
	 * @return
	 */
	public String generateCode(ModuleTypeEnum moduleType,String phoneNo,String orderNo);
}
