/* 
 * A.java  
 * 
 * version TODO
 *
 * 2015年10月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.zlebank.zplatform.commons.validator.impl.AnImpl;

/**
 * 
 * 字符数字（a-z 或 A-Z 或 0-9）
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年5月31日 上午11:51:23
 * @since
 */
@Constraint(validatedBy = AnImpl.class) //具体的实现    
@Target( { java.lang.annotation.ElementType.METHOD,    
    java.lang.annotation.ElementType.FIELD })    
@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)    
@Documented    
public @interface An {    
    String message() default "{域格式错误：域不符合规范}"; //提示信息,可以写死,可以填写国际化的key    
    int min() default 0;  
    int max() default Integer.MAX_VALUE;    
    boolean isNull() default false;
    
    
    //下面这两个属性必须添加    
    Class<?>[] groups() default {};    
    Class<? extends Payload>[] payload() default {};    
        
}    