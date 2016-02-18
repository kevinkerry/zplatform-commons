package com.zlebank.zplatform.commons.bean;

import java.util.ResourceBundle;

import com.zlebank.zplatform.commons.exception.AbstractDescribeException;

public class TestException extends AbstractDescribeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8903781961798117619L;
	private static final  ResourceBundle RESOURCE = ResourceBundle.getBundle("exception_des");
	@Override
	public String getCode() {
		return "EASAC0001";
	}

	@Override
	public ResourceBundle getResourceBundle() {
		return RESOURCE;
	}
}
