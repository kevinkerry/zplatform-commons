/* 
 * AbstractException.java  
 * 
 * version 1.0
 *
 * 2015年8月19日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.exception;

/**
 * Represent  abstract exception
 *
 * @author yangying
 * @version
 * @date 2015年8月19日 下午3:51:48
 * @since
 */
public class AbstractException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1953662807682578990L;
	private Object[] params;

	public AbstractException() {
		super();
	}

	public AbstractException(String message) {
		super(message);
	}

	public AbstractException(Throwable cause) {
		super(cause);
	}

	public AbstractException(String message, Throwable cause) {
		super(message, cause);
	}

	public AbstractException(String message, Object... params) {
		super(message);
		this.params = params;
	}

	/**
	 * @return Returns the arguments.
	 */
	public Object[] getParams() {
		return params;
	}

	/**
	 * @param arguments
	 *            The arguments to set.
	 */
	public void setArguments(Object... params) {
		this.params = params;
	}
}
