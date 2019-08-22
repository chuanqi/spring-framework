package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-22
 * @Time: 20:22
 */
//@Component
public class WinterApplicationListen implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("接受一个事件"+event);
	}
}
