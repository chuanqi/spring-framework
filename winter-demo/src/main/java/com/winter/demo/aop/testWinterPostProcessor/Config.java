package com.winter.demo.aop.testWinterPostProcessor;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: xu
 * @Date: 2019-08-21
 * @Time: 13:42
 */
@Configuration
@ComponentScan(basePackages = {"com.winter.demo.aop.testWinterPostProcessor"})
//@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

	@Bean(autowire = Autowire.BY_NAME, initMethod = "init", destroyMethod = "destroy")
	//@Scope(scopeName = "prototype")
	public Person person() {
		return new Person();
	}
	@Bean(autowire = Autowire.BY_NAME)
	public Dog dog(){
		return new Dog();
	}
}
