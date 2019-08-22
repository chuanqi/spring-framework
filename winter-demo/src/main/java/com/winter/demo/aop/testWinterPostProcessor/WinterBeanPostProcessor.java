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
			System.out.println("8.后置处理器 BeanPostProcessor 执行 postProcessBeforeInitialization,在初始化之前 "+((Person) bean).getName());
		}
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			((Person) bean).setProvince("postProcessAfterInitialization修改对象的值");
			System.out.println("10.后置处理器 BeanPostProcessor 执行 postProcessAfterInitialization,初化之后 "+((Person) bean).getName());
			System.out.println("   ====接下来会会把完全实例化的单例对象存入到singletonObjects集合中, 并执行singletonFactories.remove(beanName);earlySingletonObjects.remove(beanName);");
			return bean;
		}
		return null;
	}

}
