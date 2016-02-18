/* 
 * IBasePageService.java  
 * 
 * version TODO
 *
 * 2015-7-13 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.service;

import com.zlebank.zplatform.commons.bean.Bean;
import com.zlebank.zplatform.commons.bean.PagedResult;

/**
 * Class Description
 *
 * @author yangying
 * @version
 * @date 2015-7-13 下午04:11:26
 * @since 
 */
public interface IBasePageService<T,E extends Bean> {
    public PagedResult<E> queryPaged(int page, int pageSize, T example);
}
