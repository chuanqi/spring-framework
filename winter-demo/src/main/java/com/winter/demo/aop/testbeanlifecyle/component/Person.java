package com.winter.demo.aop.testbeanlifecyle.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:53
 */
public class Person implements InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		System.out.println("person implements DisposableBean destroy");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("person implements InitializingBean afterPropertiesSet");

	}
}
