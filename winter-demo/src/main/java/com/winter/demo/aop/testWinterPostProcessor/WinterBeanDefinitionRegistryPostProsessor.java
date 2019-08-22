package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:在BeanFactoryPostProcessor执行之前执行(在所有符合规则的bean的定义信息将要加载，但未创建bean实例，可以额外的给容器中添加一个bean)
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:45
 */
@Component
public class WinterBeanDefinitionRegistryPostProsessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("1.后置处理器 BeanDefinitionRegistryPostProcessor 执行 postProcessBeanDefinitionRegistry");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("2.后置处理器 BeanDefinitionRegistryPostProcessor 继承自 BeanFactoryPostProcessor  执行 postProcessBeanFactory");

	}
}
