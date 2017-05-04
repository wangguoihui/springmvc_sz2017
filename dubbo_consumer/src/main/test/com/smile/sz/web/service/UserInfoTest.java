package com.smile.sz.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.smile.sz.adc.bean.UserBaseDto;
import com.smile.sz.adc.intf.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserInfoTest {
	
	@Autowired
	private IUserService iUserService;

	@Test
	public void applyTest() throws Exception {
		
		try {
			UserBaseDto userBaseDto = iUserService.getUserBaseInfo(12);
			System.out.println("succeeded!");
			System.out.println(userBaseDto);
		} catch (Throwable e) {
			System.out.println("failed!");
			e.printStackTrace();
		}
		
	}
}













