package com.winter.demo.aop.testCondition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-20
 * @Time: 23:35
 */
@Configuration
@ComponentScan(basePackages = "com.winter.demo.aop.testCondition")
public class MainConfig {
	@Bean(value = "winterAspect1")
	public WinterAspect winterAspect() {
		return new WinterAspect();
	}

	/**
	 * WinterCondition中的实现方法中返回true时,才会创建这个对象
	 * @return
	 */
	@Bean
	@Conditional(value = WinterCondition.class)
	public WinterLog winterLog() {
		return new WinterLog();
	}
}
