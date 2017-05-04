package com.smile.sz.web.service.dbservice.user;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.smile.sz.web.service.dao.user.model.s61.UserInfo;
import com.smile.sz.web.service.dao.user.s61.UserInfoMapper;

/**
 * 用户接口
 * Created by Administrator on 2016.5.11 011.
 */
@Service
public class UserDBService {
	
	@Resource
	private UserInfoMapper userInfoMapper;

    public UserInfo getUserBaseInfo(Integer userId) {
        return userInfoMapper.selectByPrimaryKey(userId);
    }
 
}
