/* 
 * BasePagedQueryDAO.java  
 * 
 * version TODO
 *
 * 2015年9月8日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao;

import java.util.List;

import com.zlebank.zplatform.commons.bean.Bean;

/**
 * Class Description
 *
 * @author yangpeng
 * @version
 * @date 2015年9月8日 上午11:12:04
 * @since 
 */
public interface BasePagedQueryDAO<T,E extends Bean> extends BaseDAO<T>  {
    public long count(E example);
    public List<T> getListByQuery(int offset,int size,E example);
}
