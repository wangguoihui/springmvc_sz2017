package com.smile.sz.adc.intf;

import com.smile.sz.adc.bean.UserBaseDto;

/**
 * 
 * @author pc
 *
 */
public interface IUserService {

    /**
     * 用户基本信息
     *
     * @param userId
     * @return
     * @throws Throwable
     */
    UserBaseDto getUserBaseInfo(Integer userId) throws Throwable;
  
	
}
