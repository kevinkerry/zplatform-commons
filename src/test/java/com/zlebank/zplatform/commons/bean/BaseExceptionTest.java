package com.zlebank.zplatform.commons.bean;

import org.junit.Test;

import com.zlebank.zplatform.commons.exception.AbstractDescribeException;

public class BaseExceptionTest {
	
	class TestException extends AbstractDescribeException{

		/**
		 * 
		 */
		private static final long serialVersionUID = 8903781961798117619L;

		@Override
		public String getCode() {
			return "1111";
		}
		
	}
	
	@Test
	public void test(){
		Exception exception = new TestException();
		System.out.println(exception.getMessage());
	}
	
}
