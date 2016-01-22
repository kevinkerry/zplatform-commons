package com.zlebank.zplatform.commons.bean;

import org.junit.Test;

public class BaseExceptionTest {
	
	
	
	@Test
	public void test(){
		Exception exception = new TestException();
		System.out.println(exception.getMessage());
	}
	
}
