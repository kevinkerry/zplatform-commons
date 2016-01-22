/* 
 * CardBinDao.java  
 * 
 * version TODO
 *
 * 2015年10月10日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.commons.dao;

import com.zlebank.zplatform.commons.bean.CardBin;
import com.zlebank.zplatform.commons.dao.pojo.PojoCardBin;

/**
 * 卡binDao
 *
 * @author yangpeng
 * @version
 * @date 2015年10月10日 下午3:40:07
 * @since 
 */
public interface CardBinDao extends BaseDAO<PojoCardBin> {
        /**
         * 根据卡号得到卡bin信息
         * @param cardNo
         * @return
         */
    public CardBin getCard( String cardNo);
    
   
    

}
