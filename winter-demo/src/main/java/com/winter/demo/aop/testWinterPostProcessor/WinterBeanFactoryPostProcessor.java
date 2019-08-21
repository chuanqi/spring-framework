package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanExpressionContext;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:43
 */
@Component
public class WinterBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//获取类加载器
		ClassLoader beanClassLoader = beanFactory.getBeanClassLoader();

		//bean定义的数量
		int beanDefinitionCount = beanFactory.getBeanDefinitionCount();

		//获取所有bean定义的name
		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
		//获取表达式转换器。
		BeanExpressionResolver beanExpressionResolver = beanFactory.getBeanExpressionResolver();
		BeanExpressionContext bec=new BeanExpressionContext(beanFactory,null);

		/**
		 * 我们就可以根据能获取的条件，进行自己的业务逻辑处理
		 */

		System.out.println("3.BeanFactoryPostProcessor 执行 postProcessBeanFactory,  bean已定义好,但还没有实例化 ");
	}
}
