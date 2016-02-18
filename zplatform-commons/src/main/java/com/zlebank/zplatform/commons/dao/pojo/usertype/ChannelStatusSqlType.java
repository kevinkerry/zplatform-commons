/* 
 * CRDRSqlType.java  
 * 
 * version 1.2
 *
 * 2015年8月24日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao.pojo.usertype;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;

import com.zlebank.zplatform.commons.dao.pojo.BaseEnumSqlType;
import com.zlebank.zplatform.commons.enums.ChannelStatusType;

/**
 * 
 * 通道状态
 *
 * @author Luxiaoshuai
 * @version
 * @date 2016年1月12日 下午3:43:16
 * @since
 */
public class ChannelStatusSqlType extends BaseEnumSqlType<ChannelStatusType>{
    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor arg2,Object owner)
            throws HibernateException, SQLException {
        return ChannelStatusType.fromValue(rs.getString(names[0]));
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index,SessionImplementor arg2)
            throws HibernateException, SQLException {
        ChannelStatusType status = value!=null?(ChannelStatusType)value:ChannelStatusType.UNKNOW;
        st.setString(index, status.getCode());
    }
}
