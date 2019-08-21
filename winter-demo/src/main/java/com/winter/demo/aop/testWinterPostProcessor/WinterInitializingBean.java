package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 17:56
 */
@Component
public class WinterInitializingBean implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("11. InitializingBean 的 afterPropertiesSet方法");
	}
}
