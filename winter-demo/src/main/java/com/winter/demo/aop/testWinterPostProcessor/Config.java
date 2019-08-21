package com.winter.demo.aop.testWinterPostProcessor;

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
@ComponentScan
public class Config {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public Person person() {
		return new Person();
	}
}
