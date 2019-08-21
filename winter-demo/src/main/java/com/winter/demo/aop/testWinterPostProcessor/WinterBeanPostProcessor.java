package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:44
 */
@Component
public class WinterBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			System.out.println("8.bean名称" + beanName + "  BeanPostProcessor 执行 postProcessBeforeInitialization,在初始化之前 "+((Person) bean).getName());
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			//
			System.out.println("10.bean名称::" + beanName + " BeanPostProcessor 执行 postProcessAfterInitialization,初化之后 "+((Person) bean).getName());
		}
		return null;
	}

}
