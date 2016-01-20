package com.zlebank.zplatform.commons.dao;


/**
 * 
 * Base data access object
 *
 * @author yangying
 * @version
 * @date 2015-6-26 上午10:09:10
 * @param T
 * @since
 */
public interface BaseDAO<T> {
    /**
     * 
     * @param t
     * @return
     */
    T merge(T t);
    public T update(T t);

    public void saveA(T t);
}
