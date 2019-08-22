package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 17:17
 */
public class Dog implements InitializingBean, DisposableBean {
	@Autowired
	Person person;
	public Dog() {
		System.out.println("狗出生了");
	}
	@Override
	public String toString() {
		return "我养了一条狗";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("狗丢了");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println( person.getName()+"的狗有名称了");
	}
}
