package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:45
 */
@Component
public class WinterInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if (beanName.equalsIgnoreCase("person")) {
			System.out.println("4. InstantiationAwareBeanPostProcessor 执行 postProcessBeforeInstantiation");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			System.out.println("6.后置处理器 InstantiationAwareBeanPostProcessor 执行 postProcessAfterInstantiation 实例化完成,但还没有赋值:" + ((Person) bean).getName());

			Person person = (Person) bean;
			person.setProvince("postProcessAfterInstantiation");
			//如果返回false 	@Value("${person.age}")将无法获取到值
			// AbstractAutowireCapableBeanFactory类中 1385至1401行代码 有判断
			return true;
		}
		//这里如果返回false Autowired 也不注入
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if (bean instanceof Person) {
			System.out.println("7.后置处理器 InstantiationAwareBeanPostProcessor 执行 postProcessProperties 实例化完成 但还没有赋值 :" + ((Person) bean).getName());
			Person person = (Person) bean;
			person.setProvince("postProcessProperties");
		}
		return pvs;
	}


}
