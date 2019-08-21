package com.winter.demo.aop.testbeanlifecyle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 09:54
 */
@Component
public class WinterBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+  "   ==== postProcessBeforeInitialization");

		return bean;
	}


	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(beanName+  "   ----- postProcessAfterInitialization");
		return bean;
	}
}
